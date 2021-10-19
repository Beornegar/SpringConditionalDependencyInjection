package com.dkraus.beanChanging.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        value="iService.class",
        havingValue = "Service2",
        matchIfMissing = false)
public class Service2 implements  IService{
    @Override
    public String get() {
        return "Service 2";
    }
}
