package com.kgc.pojo;

//警告表
public class JingGao {
    private Integer jgid;//警告id
    private Integer jgyhid;//被警告的用户id
    private String jgyy;//警告原因
    private String jgdate;//警告日期
    private Integer glid;//发起警告的管理id
    private XinXi xinXi;//信息

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public Integer getJgyhid() {
        return jgyhid;
    }

    public void setJgyhid(Integer jgyhid) {
        this.jgyhid = jgyhid;
    }

    public String getJgyy() {
        return jgyy;
    }

    public void setJgyy(String jgyy) {
        this.jgyy = jgyy;
    }

    public String getJgdate() {
        return jgdate;
    }

    public void setJgdate(String jgdate) {
        this.jgdate = jgdate;
    }

    public Integer getGlid() {
        return glid;
    }

    public void setGlid(Integer glid) {
        this.glid = glid;
    }

    public XinXi getXinXi() {
        return xinXi;
    }

    public void setXinXi(XinXi xinXi) {
        this.xinXi = xinXi;
    }
}
