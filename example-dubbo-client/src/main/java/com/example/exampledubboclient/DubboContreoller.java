package com.example.exampledubboclient;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboContreoller {



    @Reference
    private DemoService demoService;

    @RequestMapping(value="dubbo")
    @ResponseBody
    public void dubbo(){
        String phone = demoService.getPhone();
        System.out.println("phone:"+phone);
    }
}
