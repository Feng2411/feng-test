package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.GoldPrice;
import com.tencent.wxcloudrun.service.GoldPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Optional<GoldPrice> goldPrice = goldPriceService.getGoldPrice("zdf");
        Integer initPrice = 0;
        if (goldPrice.isPresent()) {
            initPrice = goldPrice.get().getPrice();
        }
        System.out.println("今日金价"+initPrice);
        return ApiResponse.ok("今日金价："+initPrice);
    }
}
