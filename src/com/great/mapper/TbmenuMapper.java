package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbmenu;
import com.great.entity.TbmenuExample;
@Repository
public interface TbmenuMapper {
    int countByExample(TbmenuExample example);

    int deleteByExample(TbmenuExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Tbmenu record);

    int insertSelective(Tbmenu record);

    List<Tbmenu> selectByExample(TbmenuExample example);

    Tbmenu selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Tbmenu record, @Param("example") TbmenuExample example);

    int updateByExample(@Param("record") Tbmenu record, @Param("example") TbmenuExample example);

    int updateByPrimaryKeySelective(Tbmenu record);

    int updateByPrimaryKey(Tbmenu record);
}