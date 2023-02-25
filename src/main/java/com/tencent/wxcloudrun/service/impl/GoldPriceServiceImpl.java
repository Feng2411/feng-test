package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.GoldPriceMapper;
import com.tencent.wxcloudrun.model.GoldPrice;
import com.tencent.wxcloudrun.service.GoldPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoldPriceServiceImpl implements GoldPriceService {

    @Autowired
    private GoldPriceMapper goldPriceMapper;

    @Override
    public GoldPrice getGoldPrice(String brandName) {
        return goldPriceMapper.getPrice(brandName);
    }
}
