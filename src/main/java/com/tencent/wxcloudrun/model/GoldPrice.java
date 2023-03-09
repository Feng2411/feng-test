package com.tencent.wxcloudrun.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GoldPrice implements Serializable {
    private Integer id;

    private String brandName;

    private Integer price;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date upTime;
}
