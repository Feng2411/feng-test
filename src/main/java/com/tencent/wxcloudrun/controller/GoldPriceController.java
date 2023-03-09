package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.GoldPrice;
import com.tencent.wxcloudrun.service.GoldPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class GoldPriceController {
    final GoldPriceService goldPriceService;

    final Logger logger;

    public GoldPriceController(@Autowired GoldPriceService goldPriceService) {
        this.goldPriceService = goldPriceService;
        this.logger = LoggerFactory.getLogger(GoldPriceService.class);
    }

    /**
     * 主页页面
     * @return API response html
     */
    @GetMapping(value = "/gold/todayPrice")
    ApiResponse getTodayGoldPrice() {
        GoldPrice goldPriceZdf = goldPriceService.getGoldPrice("周大福");
        GoldPrice goldPriceZss = goldPriceService.getGoldPrice("周生生");
        GoldPrice goldPriceLf = goldPriceService.getGoldPrice("六福珠宝");
        List<GoldPrice> goldPriceList = new ArrayList<>();
        goldPriceList.add(goldPriceZdf);
        goldPriceList.add(goldPriceZss);
        goldPriceList.add(goldPriceLf);
        return ApiResponse.ok(goldPriceList);
    }
}
