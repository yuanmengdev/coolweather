package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by meng on 2018/6/17.
 */

public class Province extends DataSupport {
    private int id;//每个实体类中都该有的字段你
    private String provinceName;//省份的名字
    private int provinceCode;//省份的代号

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
