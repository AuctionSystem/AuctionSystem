package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbgood;
import com.great.entity.TbgoodExample;
@Repository
public interface TbgoodMapper {
    int countByExample(TbgoodExample example);

    int deleteByExample(TbgoodExample example);

    int deleteByPrimaryKey(Integer goodid);

    int insert(Tbgood record);

    int insertSelective(Tbgood record);

    List<Tbgood> selectByExample(TbgoodExample example);

    Tbgood selectByPrimaryKey(Integer goodid);

    int updateByExampleSelective(@Param("record") Tbgood record, @Param("example") TbgoodExample example);

    int updateByExample(@Param("record") Tbgood record, @Param("example") TbgoodExample example);

    int updateByPrimaryKeySelective(Tbgood record);

    int updateByPrimaryKey(Tbgood record);
}