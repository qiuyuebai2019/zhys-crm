package com.zhys.crm.collector;

import com.zhys.crm.loginCheck.request.LoginCheckRequest;
import com.zhys.crm.loginCheck.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 11时34分
 */
@RestController
public class LoginCheckCollecter {
    @Autowired
    private LoginService service;

    @PostMapping("/loginCheck")
    public boolean  loginCheck(LoginCheckRequest request){

        return  service.loginCheck(request);
    }

    @GetMapping("l")
    public String  l(){
        return  "nihaoa";
    }

}
