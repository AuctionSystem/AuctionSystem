/**
 * 
 */
package com.great.handler;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.great.modal.CreateImage;
import com.great.modal.User;
import com.great.service.UserService;
import com.great.utils.ImageUtil;

/**
 * @author gxx
 * @creation 创建时间:2018年7月3日 下午4:21:07
 * @Git
 *
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

	private List<User> users;

	@Resource
	private UserService userService;

	@RequestMapping(value = "/qurry.action")
	public void qurry(HttpServletRequest request) {
		System.out.println("111111111111111111");
		users = userService.qurry();
		System.out.println("user" + users);

	}

	@RequestMapping(value = "/createImage.action", method = RequestMethod.GET)
	public @ResponseBody void createImage(HttpServletRequest request, HttpServletResponse response) {

		// 禁止缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);

		// 生成验证码
		Map<String, BufferedImage> imageMap = ImageUtil.createImage();
		String code = imageMap.keySet().iterator().next();
		request.getSession().setAttribute("imageCode", code);
		// myImageCode = code;

		// 返回生成的验证码
		BufferedImage image = imageMap.get(code);
		try {
			ServletOutputStream sos = response.getOutputStream();
			ImageIO.write(image, "JPEG", sos);
			response.getOutputStream().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/login.action")
	public String login(HttpServletRequest request, CreateImage createImage, User user) {

		System.out.println("1111111");
		String code = createImage.getCode();
		System.out.println("code=" + code);
		String imageCode = (String) request.getSession().getAttribute("imageCode");
		System.out.println("imageCode=" + imageCode);
		if (code.equalsIgnoreCase(imageCode)) {

			User u = userService.login(user);
			if (u != null) {
				String name = user.getUserName();
				String pwd = user.getUserPwd();
				System.out.println("name=" + name);
				System.out.println("pwd=" + pwd);
				System.out.println("daole");
				return "/home/view_client";
			}

		}

		return null;

	}
}
