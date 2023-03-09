package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.GoldPrice;

import java.util.Optional;

public interface GoldPriceService {
    GoldPrice getGoldPrice(String brandName);
}
