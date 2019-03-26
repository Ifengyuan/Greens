package com.fengyuan.greens.vo;

import java.util.Date;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/26 8:11
 */
public class VShoppingCar {
    private Integer id;
    private Integer uid;
    private String goodsname;
    private Date time;
    private Integer price;
    private String picture;
    private Integer goodsflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getGoodsflag() {
        return goodsflag;
    }

    public void setGoodsflag(Integer goodsflag) {
        this.goodsflag = goodsflag;
    }
}
