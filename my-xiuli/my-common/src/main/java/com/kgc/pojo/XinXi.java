package com.kgc.pojo;

//信息
public class XinXi {
    private Integer xxid;//信息id
    private Integer yhid;//用户id
    private String xxnr;//信息内容
    private String xxdate;//信息时间
    private Integer glid;//管理id

    public Integer getXxid() {
        return xxid;
    }

    public void setXxid(Integer xxid) {
        this.xxid = xxid;
    }

    public Integer getYhid() {
        return yhid;
    }

    public void setYhid(Integer yhid) {
        this.yhid = yhid;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getXxdate() {
        return xxdate;
    }

    public void setXxdate(String xxdate) {
        this.xxdate = xxdate;
    }

    public Integer getGlid() {
        return glid;
    }

    public void setGlid(Integer glid) {
        this.glid = glid;
    }
}
