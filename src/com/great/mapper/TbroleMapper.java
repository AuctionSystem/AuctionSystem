package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbrole;
import com.great.entity.TbroleExample;
@Repository
public interface TbroleMapper {
    int countByExample(TbroleExample example);

    int deleteByExample(TbroleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Tbrole record);

    int insertSelective(Tbrole record);

    List<Tbrole> selectByExample(TbroleExample example);

    Tbrole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Tbrole record, @Param("example") TbroleExample example);

    int updateByExample(@Param("record") Tbrole record, @Param("example") TbroleExample example);

    int updateByPrimaryKeySelective(Tbrole record);

    int updateByPrimaryKey(Tbrole record);
}