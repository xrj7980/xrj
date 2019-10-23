package com.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hellFallback")
    @Override
    public String ts() {
        return restTemplate.getForEntity("http://provider/test",String.class).getBody();
    }

    public String  hellFallback(){
        return "失败";
    }
}
