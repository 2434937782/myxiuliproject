package com.kgc.pojo;

import java.io.Serializable;

public class Youhuijuan implements Serializable {
    private Integer yhId;// INT PRIMARY KEY AUTO_INCREMENT,
    private String wname;// VARCHAR(30),
    private String Pin_id;// VARCHAR(10),
    private String xing_id;// VARCHAR(15),
    private Integer y_id;// INT(15)


    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getPin_id() {
        return Pin_id;
    }

    public void setPin_id(String pin_id) {
        Pin_id = pin_id;
    }

    public String getXing_id() {
        return xing_id;
    }

    public void setXing_id(String xing_id) {
        this.xing_id = xing_id;
    }

    public Integer getY_id() {
        return y_id;
    }

    public void setY_id(Integer y_id) {
        this.y_id = y_id;
    }
}
