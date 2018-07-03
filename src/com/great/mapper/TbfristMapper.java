package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbfrist;
import com.great.entity.TbfristExample;
@Repository
public interface TbfristMapper {
    int countByExample(TbfristExample example);

    int deleteByExample(TbfristExample example);

    int deleteByPrimaryKey(Short fristid);

    int insert(Tbfrist record);

    int insertSelective(Tbfrist record);

    List<Tbfrist> selectByExample(TbfristExample example);

    Tbfrist selectByPrimaryKey(Short fristid);

    int updateByExampleSelective(@Param("record") Tbfrist record, @Param("example") TbfristExample example);

    int updateByExample(@Param("record") Tbfrist record, @Param("example") TbfristExample example);

    int updateByPrimaryKeySelective(Tbfrist record);

    int updateByPrimaryKey(Tbfrist record);
}