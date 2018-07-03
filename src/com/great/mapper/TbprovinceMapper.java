package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbprovince;
import com.great.entity.TbprovinceExample;
@Repository
public interface TbprovinceMapper {
    int countByExample(TbprovinceExample example);

    int deleteByExample(TbprovinceExample example);

    int deleteByPrimaryKey(Integer provinceid);

    int insert(Tbprovince record);

    int insertSelective(Tbprovince record);

    List<Tbprovince> selectByExample(TbprovinceExample example);

    Tbprovince selectByPrimaryKey(Integer provinceid);

    int updateByExampleSelective(@Param("record") Tbprovince record, @Param("example") TbprovinceExample example);

    int updateByExample(@Param("record") Tbprovince record, @Param("example") TbprovinceExample example);

    int updateByPrimaryKeySelective(Tbprovince record);

    int updateByPrimaryKey(Tbprovince record);
}