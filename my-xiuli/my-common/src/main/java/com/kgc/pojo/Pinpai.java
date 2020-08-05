package com.kgc.pojo;

import java.io.Serializable;

public class Pinpai implements Serializable {
    private Integer P_id;//INT PRIMARY KEY AUTO_INCREMENT,
    private String wpin;// VARCHAR(30)

    public Integer getP_id() {
        return P_id;
    }

    public void setP_id(Integer p_id) {
        P_id = p_id;
    }

    public String getWpin() {
        return wpin;
    }

    public void setWpin(String wpin) {
        this.wpin = wpin;
    }
}
