package com.kgc.pojo;

import java.io.Serializable;

public class Xinghao implements Serializable {
    private Integer xd_id;//INT PRIMARY KEY AUTO_INCREMENT,
    private String wpin;// VARCHAR(30)

    public Integer getXd_id() {
        return xd_id;
    }

    public void setXd_id(Integer xd_id) {
        this.xd_id = xd_id;
    }

    public String getWpin() {
        return wpin;
    }

    public void setWpin(String wpin) {
        this.wpin = wpin;
    }
}
