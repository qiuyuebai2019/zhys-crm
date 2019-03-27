package com.zhys.crm.login.entity;

import java.io.Serializable;

/**
 * .
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 11时01分
 */
public class LoginCheckBo {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
