package com.aliware.edas.service;

import com.taobao.hsf.app.spring.util.annotation.HSFProvider;

import java.time.LocalDateTime;

@HSFProvider(serviceGroup = "sch",serviceInterface = ProvideTimeService.class, serviceVersion = "1.0.0")
public class ProvideTimeServiceImpl implements ProvideTimeService {
    @Override
    public String getTime(String string) {
        return string+"_"+LocalDateTime.now();
    }
}
