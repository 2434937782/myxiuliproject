package com.kgc.pojo;

import java.io.Serializable;

public class Dingdan implements Serializable {
    private Integer ddid;//INT AUTO_INCREMENT PRIMARY KEY,
    private String tupian;// VARCHAR(50),
    private String ddmz;// VARCHAR(50),
    private String ddjg;// DOUBLE,
    private Integer userid;// INT,
    private Integer goodid;// INT
    private Integer dtype;

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian;
    }

    public String getDdmz() {
        return ddmz;
    }

    public void setDdmz(String ddmz) {
        this.ddmz = ddmz;
    }

    public String getDdjg() {
        return ddjg;
    }

    public void setDdjg(String ddjg) {
        this.ddjg = ddjg;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }
}
