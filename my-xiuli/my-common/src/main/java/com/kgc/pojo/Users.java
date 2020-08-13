package com.kgc.pojo;

import java.io.Serializable;

public class Users implements Serializable {

    private Integer Id;// INT PRIMARY KEY AUTO_INCREMENT,
    private String Name;// VARCHAR(30),
    private String Nickname;// VARCHAR(10),
    private String Password;// VARCHAR(15),
    private String Phone;// VARCHAR(10),
    private String Address;//VARCHAR(50),
    private String Shen;// VARCHAR(20),
    private String Type;// VARCHAR(20),
    private String YhqId;// INT(20)

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getShen() {
        return Shen;
    }

    public void setShen(String shen) {
        Shen = shen;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getYhqId() {
        return YhqId;
    }

    public void setYhqId(String yhqId) {
        YhqId = yhqId;
    }
}
