package com.example.demo.bean;

import javax.persistence.*;

@Table(name = "pca_areas")
public class PcaAreas {
    /**
     * 区/县id
     */
    @Id
    @Column(name = "area_id")
    private String areaId;

    /**
     * 区/县名称
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 市id
     */
    @Column(name = "city_id")
    private String cityId;

    /**
     * 获取区/县id
     *
     * @return area_id - 区/县id
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置区/县id
     *
     * @param areaId 区/县id
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取区/县名称
     *
     * @return area_name - 区/县名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置区/县名称
     *
     * @param areaName 区/县名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取市id
     *
     * @return city_id - 市id
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置市id
     *
     * @param cityId 市id
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}