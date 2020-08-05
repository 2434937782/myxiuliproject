package com.kgc.pojo;

public class Gonggao {
    private Integer ggid;//公告id
    private String ggtitle;//公告标题
    private String ggcontent;//公告内容
    private String ggdate;//公告内容
    private Integer glid;//管理id

    public Integer getGgid() {

        return ggid;
    }

    public void setGgid(Integer ggid) {
        this.ggid = ggid;
    }

    public String getGgtitle() {
        return ggtitle;
    }

    public void setGgtitle(String ggtitle) {
        this.ggtitle = ggtitle;
    }

    public String getGgcontent() {
        return ggcontent;
    }

    public void setGgcontent(String ggcontent) {
        this.ggcontent = ggcontent;
    }

    public String getGgdate() {
        return ggdate;
    }

    public void setGgdate(String ggdate) {
        this.ggdate = ggdate;
    }

    public Integer getGlid() {
        return glid;
    }

    public void setGlid(Integer glid) {
        this.glid = glid;
    }
}
