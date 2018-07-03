package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbrolepower;
import com.great.entity.TbrolepowerExample;
@Repository
public interface TbrolepowerMapper {
    int countByExample(TbrolepowerExample example);

    int deleteByExample(TbrolepowerExample example);

    int deleteByPrimaryKey(Integer rolepowerid);

    int insert(Tbrolepower record);

    int insertSelective(Tbrolepower record);

    List<Tbrolepower> selectByExample(TbrolepowerExample example);

    Tbrolepower selectByPrimaryKey(Integer rolepowerid);

    int updateByExampleSelective(@Param("record") Tbrolepower record, @Param("example") TbrolepowerExample example);

    int updateByExample(@Param("record") Tbrolepower record, @Param("example") TbrolepowerExample example);

    int updateByPrimaryKeySelective(Tbrolepower record);

    int updateByPrimaryKey(Tbrolepower record);
}