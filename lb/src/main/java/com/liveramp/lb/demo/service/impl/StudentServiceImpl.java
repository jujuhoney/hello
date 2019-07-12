package com.liveramp.lb.demo.service.impl;

import com.liveramp.lb.demo.mapper.TestMapper;
import com.liveramp.lb.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String getOne() {
        return testMapper.getOne();

    }
}
