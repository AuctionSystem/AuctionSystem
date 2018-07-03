package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbgoodstate;
import com.great.entity.TbgoodstateExample;
@Repository
public interface TbgoodstateMapper {
    int countByExample(TbgoodstateExample example);

    int deleteByExample(TbgoodstateExample example);

    int deleteByPrimaryKey(Integer goodstateid);

    int insert(Tbgoodstate record);

    int insertSelective(Tbgoodstate record);

    List<Tbgoodstate> selectByExample(TbgoodstateExample example);

    Tbgoodstate selectByPrimaryKey(Integer goodstateid);

    int updateByExampleSelective(@Param("record") Tbgoodstate record, @Param("example") TbgoodstateExample example);

    int updateByExample(@Param("record") Tbgoodstate record, @Param("example") TbgoodstateExample example);

    int updateByPrimaryKeySelective(Tbgoodstate record);

    int updateByPrimaryKey(Tbgoodstate record);
}