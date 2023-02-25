package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GoldPrice implements Serializable {
    private Integer id;

    private String brand;

    private Integer price;

    private Date upTime;
}
