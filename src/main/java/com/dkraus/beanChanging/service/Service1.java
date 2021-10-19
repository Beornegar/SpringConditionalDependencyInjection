package com.dkraus.beanChanging.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        value="iService.class",
        havingValue = "Service1",
        matchIfMissing = true)
public class Service1 implements  IService{
    @Override
    public String get() {
        return "Service 1";
    }
}
