package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbpower;
import com.great.entity.TbpowerExample;
@Repository
public interface TbpowerMapper {
    int countByExample(TbpowerExample example);

    int deleteByExample(TbpowerExample example);

    int deleteByPrimaryKey(Integer powerid);

    int insert(Tbpower record);

    int insertSelective(Tbpower record);

    List<Tbpower> selectByExample(TbpowerExample example);

    Tbpower selectByPrimaryKey(Integer powerid);

    int updateByExampleSelective(@Param("record") Tbpower record, @Param("example") TbpowerExample example);

    int updateByExample(@Param("record") Tbpower record, @Param("example") TbpowerExample example);

    int updateByPrimaryKeySelective(Tbpower record);

    int updateByPrimaryKey(Tbpower record);
}