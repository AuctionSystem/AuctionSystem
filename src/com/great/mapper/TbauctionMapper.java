package com.great.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Tbauction;
import com.great.entity.TbauctionExample;
@Repository
public interface TbauctionMapper {
    int countByExample(TbauctionExample example);

    int deleteByExample(TbauctionExample example);

    int deleteByPrimaryKey(Long auctionid);

    int insert(Tbauction record);

    int insertSelective(Tbauction record);

    List<Tbauction> selectByExample(TbauctionExample example);

    Tbauction selectByPrimaryKey(Long auctionid);

    int updateByExampleSelective(@Param("record") Tbauction record, @Param("example") TbauctionExample example);

    int updateByExample(@Param("record") Tbauction record, @Param("example") TbauctionExample example);

    int updateByPrimaryKeySelective(Tbauction record);

    int updateByPrimaryKey(Tbauction record);
}