package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.stuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stuservice extends ServiceImpl<stuMapper,Student> implements IStuservice {

    @Autowired
    private stuMapper stuMapper;
}
