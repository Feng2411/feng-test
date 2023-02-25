package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.GoldPrice;
import com.tencent.wxcloudrun.service.GoldPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */
@Controller

public class IndexController {

  final GoldPriceService goldPriceService;

  final Logger logger;

  public IndexController(@Autowired GoldPriceService goldPriceService) {
    this.goldPriceService = goldPriceService;
    this.logger = LoggerFactory.getLogger(GoldPriceService.class);
  }

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping(value = "/gold/todayPrice")
  ApiResponse getTodayGoldPrice() {
    GoldPrice goldPrice = goldPriceService.getGoldPrice("zdf");
    return ApiResponse.ok("今日金价"+goldPrice.getPrice());
  }

}
