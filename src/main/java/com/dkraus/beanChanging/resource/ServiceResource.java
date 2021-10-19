package com.dkraus.beanChanging.resource;

import com.dkraus.beanChanging.service.IService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceResource {

    private final IService service;


    public ServiceResource(IService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public String getService() {
        return  service.get();
    }

}
