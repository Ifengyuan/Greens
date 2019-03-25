package com.fengyuan.greens.entity;

public class Address {
    private Integer id;

    private Integer uid;

    private String address;

    private Integer addflag;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAddflag() {
        return addflag;
    }

    public void setAddflag(Integer addflag) {
        this.addflag = addflag;
    }
}