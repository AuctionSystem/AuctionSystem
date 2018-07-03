package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbsecond;
import com.great.entity.TbsecondExample;
@Repository
public interface TbsecondMapper {
    int countByExample(TbsecondExample example);

    int deleteByExample(TbsecondExample example);

    int deleteByPrimaryKey(Short secondid);

    int insert(Tbsecond record);

    int insertSelective(Tbsecond record);

    List<Tbsecond> selectByExample(TbsecondExample example);

    Tbsecond selectByPrimaryKey(Short secondid);

    int updateByExampleSelective(@Param("record") Tbsecond record, @Param("example") TbsecondExample example);

    int updateByExample(@Param("record") Tbsecond record, @Param("example") TbsecondExample example);

    int updateByPrimaryKeySelective(Tbsecond record);

    int updateByPrimaryKey(Tbsecond record);
}