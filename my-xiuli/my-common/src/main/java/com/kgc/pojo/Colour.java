package com.kgc.pojo;

import java.io.Serializable;

public class Colour implements Serializable {
    private Integer ys_id;//INT PRIMARY KEY AUTO_INCREMENT,
    private String wpin;// VARCHAR(30)

    public Integer getYs_id() {
        return ys_id;
    }

    public void setYs_id(Integer ys_id) {
        this.ys_id = ys_id;
    }

    public String getWpin() {
        return wpin;
    }

    public void setWpin(String wpin) {
        this.wpin = wpin;
    }
}
