package com.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class ) //注意:dubbo的注解  不是spring的
//@Component
public class DemoServiceImpl implements DemoService{

    @Override
    public String getPhone() {
        System.out.println("dubbo-provider返回值");
        return "110 "+System.currentTimeMillis();
    }
}
