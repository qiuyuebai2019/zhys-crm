package com.zhys.crm.loginCheck.service;

import com.zhys.crm.loginCheck.request.LoginCheckRequest;

/**
 * 登陆验证服务接口.
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 10时52分
 */
public interface LoginService {

    public boolean loginCheck(LoginCheckRequest request);
}
