package com.zhys.crm.login.dao;

import com.zhys.crm.login.entity.LoginCheckBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * .
 *
 * @author jiangxin (name@zhengheyingshi.com)
 * @since 2019年03月27日 11时07分
 */
@Mapper
public interface LoginDao {
   // @Select("select count(*) from user where name=#{arg0} and password=#{arg1}")
    public Integer count(LoginCheckBo bo);
}
