package com.kedu.practice.service;

import com.kedu.practice.entity.UserInfo;
import com.kedu.practice.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzifeng
 * @date 2019/11/27
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getById(int id) {
        return userInfoMapper.getById(id);
    }
}
