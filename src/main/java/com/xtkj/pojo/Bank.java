package com.xtkj.pojo;

public class Bank {
    private Integer bId;

    private String bName;

    private Float bMoney;

    private Float money;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public Float getbMoney() {
        return bMoney;
    }

    public void setbMoney(Float bMoney) {
        this.bMoney = bMoney;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}