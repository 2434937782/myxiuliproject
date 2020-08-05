package com.kgc.pojo;

import java.io.Serializable;

public class Fankui implements Serializable {

    private Integer Fkid;
    private String Fktitle;
    private String Fknei;
    private String Fkname;
    private Integer GIId;//外键

    public Fankui() {
    }
    public Fankui(Integer fkid, String fktitle, String fknei, String fkname, Integer GIId) {
        Fkid = fkid;
        Fktitle = fktitle;
        Fknei = fknei;
        Fkname = fkname;
        this.GIId = GIId;
    }

    public Integer getFkid() {
        return Fkid;
    }

    public void setFkid(Integer fkid) {
        Fkid = fkid;
    }

    public String getFktitle() {
        return Fktitle;
    }

    public void setFktitle(String fktitle) {
        Fktitle = fktitle;
    }

    public String getFknei() {
        return Fknei;
    }

    public void setFknei(String fknei) {
        Fknei = fknei;
    }

    public String getFkname() {
        return Fkname;
    }

    public void setFkname(String fkname) {
        Fkname = fkname;
    }

    public Integer getGIId() {
        return GIId;
    }

    public void setGIId(Integer GIId) {
        this.GIId = GIId;
    }
}
