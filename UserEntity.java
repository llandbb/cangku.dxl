package com.ambow.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@Data
public class UserEntity {
    private int uid;
    private String uname;
    private String upwd;
    private String uphone;
    private int uflag;
    private RoleEntity uroleid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public int getUflag() {
        return uflag;
    }

    public void setUflag(int uflag) {
        this.uflag = uflag;
    }

    public RoleEntity getUroleid() {
        return uroleid;
    }

    public void setUroleid(RoleEntity uroleid) {
        this.uroleid = uroleid;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uflag=" + uflag +
                ", uroleid=" + uroleid +
                '}';
    }
}