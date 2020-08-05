package com.kgc.pojo;

import java.io.Serializable;

public class Questions implements Serializable {

    private Integer Qid;
    private String Qwen;
    private  String Qda;

    public Questions() {
    }
    public Questions(Integer qid, String qwen, String qda) {
        Qid = qid;
        Qwen = qwen;
        Qda = qda;
    }

    public Integer getQid() {
        return Qid;
    }

    public void setQid(Integer qid) {
        Qid = qid;
    }

    public String getQwen() {
        return Qwen;
    }

    public void setQwen(String qwen) {
        Qwen = qwen;
    }

    public String getQda() {
        return Qda;
    }

    public void setQda(String qda) {
        Qda = qda;
    }
}
