package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.GoldPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoldPriceMapper {

    GoldPrice getPrice(@Param("brand") String brand);
}
