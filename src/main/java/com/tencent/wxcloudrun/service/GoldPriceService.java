package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.GoldPrice;

import java.util.Optional;

public interface GoldPriceService {
    Optional<GoldPrice> getGoldPrice(String brandName);
}
