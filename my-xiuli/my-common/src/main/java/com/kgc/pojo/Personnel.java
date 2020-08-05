package com.kgc.pojo;

import java.io.Serializable;

public class Personnel implements Serializable {
    private Integer gl_Id;// INT PRIMARY KEY AUTO_INCREMENT,
    private String gl_name;// VARCHAR(30),
    private String gl_Password;// VARCHAR(10),
    private String zhiwu;// VARCHAR(15)

    public Integer getGl_Id() {
        return gl_Id;
    }

    public void setGl_Id(Integer gl_Id) {
        this.gl_Id = gl_Id;
    }

    public String getGl_name() {
        return gl_name;
    }

    public void setGl_name(String gl_name) {
        this.gl_name = gl_name;
    }

    public String getGl_Password() {
        return gl_Password;
    }

    public void setGl_Password(String gl_Password) {
        this.gl_Password = gl_Password;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }
}
