package com.example.zhangyiwei.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangyiwei on 2018/4/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
