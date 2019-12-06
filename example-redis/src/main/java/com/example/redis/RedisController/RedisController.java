package com.example.redis.RedisController;

import com.example.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value="redis")
    @ResponseBody
    public Object redis(String phone){
        Object o = redisUtil.get(phone);
        return o;
    }
}
