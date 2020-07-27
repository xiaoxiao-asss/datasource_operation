package com.example.demo;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.entity.UserInfo;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user2")
public class UserController2 {

    @Autowired
    private UserService userServiceImpl;

    /**
     * 不使用注解使用默认数据源
     * @return
     */
    @GetMapping("/test")
    public List<UserInfo> listAll(){
        List<UserInfo> result = userServiceImpl.listAll();
        return result;

    }

    /**
     *  使用传递参数数据源
     * @param dataName
     * @return
     */
    @DS("#dataName")
    @GetMapping("/test2")
    public List<UserInfo> listAl(String dataName){
        List<UserInfo> result = userServiceImpl.listAll();
        return result;

    }
}
