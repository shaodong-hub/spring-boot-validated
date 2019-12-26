package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.Cross;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

/**
 * <p>
 * 创建时间为 下午6:10 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserInfoBodyController {

    Page<UserInfoDO> findAll(Pageable pageable);

    /**
     * 交叉校验,逻辑可以自定义,也可以用在普通的方法上,不仅仅是 Controller 上
     *
     * @param pass1 pass1
     * @param pass2 pass2
     * @return String
     */
    @Cross
    String passCheck(String pass1, String pass2);

    UserInfoDO createUser(@Validated UserInfoDO userInfoDO);

    UserInfoDO updateUser(@Validated UserInfoDO userInfoDO);

}
