package com.example.zhangyiwei.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangyiwei on 2018/4/2.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
