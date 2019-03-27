package com.zhys.crm.loginCheck.request;

import java.io.Serializable;

/**
 * 登陆验证请求.
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 10时47分
 */
public class LoginCheckRequest implements Serializable {

    private static final long serialVersionUID = -6229761210602455533L;

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
