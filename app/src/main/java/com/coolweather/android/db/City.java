package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by meng on 2018/6/17.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市的名字
    private int cityCode;//城市的代号
    private int provinceId;//当前城市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
