package com.example.zhangyiwei.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangyiwei on 2018/4/9.
 */

public class Basic {

    //使用SerializedNamed注解的方式来让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
