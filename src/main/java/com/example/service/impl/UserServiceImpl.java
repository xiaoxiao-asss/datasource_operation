package com.example.service.impl;

import com.example.entity.UserInfo;
import com.example.mapper.Test1Mapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Test1Mapper test1Mapper;


    @Override
    public  List<UserInfo> listAll() {
       List<UserInfo> userInfos=test1Mapper.queryUserInfo();
        return userInfos;
    }

}
