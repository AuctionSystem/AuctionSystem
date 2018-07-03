package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbuserstate;
import com.great.entity.TbuserstateExample;
@Repository
public interface TbuserstateMapper {
    int countByExample(TbuserstateExample example);

    int deleteByExample(TbuserstateExample example);

    int deleteByPrimaryKey(Short userstateid);

    int insert(Tbuserstate record);

    int insertSelective(Tbuserstate record);

    List<Tbuserstate> selectByExample(TbuserstateExample example);

    Tbuserstate selectByPrimaryKey(Short userstateid);

    int updateByExampleSelective(@Param("record") Tbuserstate record, @Param("example") TbuserstateExample example);

    int updateByExample(@Param("record") Tbuserstate record, @Param("example") TbuserstateExample example);

    int updateByPrimaryKeySelective(Tbuserstate record);

    int updateByPrimaryKey(Tbuserstate record);
}