package com.zhys.crm.login.business.impl;

import com.zhys.crm.login.business.LoginCheckBusiness;
import com.zhys.crm.login.dao.LoginDao;
import com.zhys.crm.login.entity.LoginCheckBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 11时06分
 */
@Component
public class LoginCheckBusinessimpl implements LoginCheckBusiness {

    @Autowired
    private LoginDao loginDao;

    public Integer loginCheck(LoginCheckBo bo) {

        return loginDao.count(bo);
    }
}
