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