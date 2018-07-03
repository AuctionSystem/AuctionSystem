package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tblikegoods;
import com.great.entity.TblikegoodsExample;
@Repository
public interface TblikegoodsMapper {
    int countByExample(TblikegoodsExample example);

    int deleteByExample(TblikegoodsExample example);

    int deleteByPrimaryKey(Integer userlikeid);

    int insert(Tblikegoods record);

    int insertSelective(Tblikegoods record);

    List<Tblikegoods> selectByExample(TblikegoodsExample example);

    Tblikegoods selectByPrimaryKey(Integer userlikeid);

    int updateByExampleSelective(@Param("record") Tblikegoods record, @Param("example") TblikegoodsExample example);

    int updateByExample(@Param("record") Tblikegoods record, @Param("example") TblikegoodsExample example);

    int updateByPrimaryKeySelective(Tblikegoods record);

    int updateByPrimaryKey(Tblikegoods record);
}