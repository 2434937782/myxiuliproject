package com.kgc.pojo;

import java.io.Serializable;

public class Youhui implements Serializable {
    private  Integer yhqid;// INT AUTO_INCREMENT PRIMARY KEY,
    private String  yhqCode;// LONG NOT NULL,
    private String   ystart;// DATETIME,
    private String  yjieshu;// DATETIME,
    private Integer  ynum;// INT,
    private String  yprice;// DOUBLE

    public Integer getYhqid() {
        return yhqid;
    }

    public void setYhqid(Integer yhqid) {
        this.yhqid = yhqid;
    }

    public String getYhqCode() {
        return yhqCode;
    }

    public void setYhqCode(String yhqCode) {
        this.yhqCode = yhqCode;
    }

    public String getYstart() {
        return ystart;
    }

    public void setYstart(String ystart) {
        this.ystart = ystart;
    }

    public String getYjieshu() {
        return yjieshu;
    }

    public void setYjieshu(String yjieshu) {
        this.yjieshu = yjieshu;
    }

    public Integer getYnum() {
        return ynum;
    }

    public void setYnum(Integer ynum) {
        this.ynum = ynum;
    }

    public String getYprice() {
        return yprice;
    }

    public void setYprice(String yprice) {
        this.yprice = yprice;
    }
}
