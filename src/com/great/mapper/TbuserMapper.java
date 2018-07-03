package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbuser;
import com.great.entity.TbuserExample;
@Repository
public interface TbuserMapper {
    int countByExample(TbuserExample example);

    int deleteByExample(TbuserExample example);

    int deleteByPrimaryKey(Short userid);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    List<Tbuser> selectByExample(TbuserExample example);

    Tbuser selectByPrimaryKey(Short userid);

    int updateByExampleSelective(@Param("record") Tbuser record, @Param("example") TbuserExample example);

    int updateByExample(@Param("record") Tbuser record, @Param("example") TbuserExample example);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);
}