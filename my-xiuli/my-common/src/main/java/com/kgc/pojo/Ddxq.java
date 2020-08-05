package com.kgc.pojo;

import java.io.Serializable;

public class Ddxq implements Serializable {
    public Integer ddxqid;// INT AUTO_INCREMENT PRIMARY KEY,
    public Integer ddidd;// INT,
    private String dshi;// DATETIME,
    private String dstart;// DATETIME,
    public Integer dtype;//INT,
    private String dtui;// DATETIME,
    private String djiname;// VARCHAR(30),
    private String djiphone;// VARCHAR(100),
    private String daddress;//VARCHAR(100)

    public Integer getDdxqid() {
        return ddxqid;
    }

    public void setDdxqid(Integer ddxqid) {
        this.ddxqid = ddxqid;
    }

    public Integer getDdidd() {
        return ddidd;
    }

    public void setDdidd(Integer ddidd) {
        this.ddidd = ddidd;
    }

    public String getDshi() {
        return dshi;
    }

    public void setDshi(String dshi) {
        this.dshi = dshi;
    }

    public String getDstart() {
        return dstart;
    }

    public void setDstart(String dstart) {
        this.dstart = dstart;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public String getDtui() {
        return dtui;
    }

    public void setDtui(String dtui) {
        this.dtui = dtui;
    }

    public String getDjiname() {
        return djiname;
    }

    public void setDjiname(String djiname) {
        this.djiname = djiname;
    }

    public String getDjiphone() {
        return djiphone;
    }

    public void setDjiphone(String djiphone) {
        this.djiphone = djiphone;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }
}
