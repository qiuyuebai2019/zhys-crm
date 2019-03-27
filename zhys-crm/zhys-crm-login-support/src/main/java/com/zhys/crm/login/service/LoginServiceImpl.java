package com.zhys.crm.login.service;

import com.zhys.crm.login.business.LoginCheckBusiness;
import com.zhys.crm.login.entity.LoginCheckBo;
import com.zhys.crm.loginCheck.request.LoginCheckRequest;
import com.zhys.crm.loginCheck.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 登陆验证服务的实现.
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 10时59分
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginCheckBusiness loginCheckBusiness;

    public boolean loginCheck(LoginCheckRequest request) {
        LoginCheckBo bo = new LoginCheckBo();
        bo.setName(request.getName());
        bo.setPassword(request.getPassword());
        if(loginCheckBusiness.loginCheck(bo)==0){
            return false;
        }else {
            return true;
        }
    }
}
