package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbcity;
import com.great.entity.TbcityExample;
@Repository
public interface TbcityMapper {
    int countByExample(TbcityExample example);

    int deleteByExample(TbcityExample example);

    int deleteByPrimaryKey(Integer cityid);

    int insert(Tbcity record);

    int insertSelective(Tbcity record);

    List<Tbcity> selectByExample(TbcityExample example);

    Tbcity selectByPrimaryKey(Integer cityid);

    int updateByExampleSelective(@Param("record") Tbcity record, @Param("example") TbcityExample example);

    int updateByExample(@Param("record") Tbcity record, @Param("example") TbcityExample example);

    int updateByPrimaryKeySelective(Tbcity record);

    int updateByPrimaryKey(Tbcity record);
}