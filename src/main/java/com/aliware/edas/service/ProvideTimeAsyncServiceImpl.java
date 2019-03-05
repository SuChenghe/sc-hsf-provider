package com.aliware.edas.service;

import com.taobao.hsf.app.spring.util.annotation.HSFProvider;

import java.time.LocalDateTime;

@HSFProvider(serviceGroup = "sch",serviceInterface = ProvideTimeAsyncService.class, serviceVersion = "1.0.0")
public class ProvideTimeAsyncServiceImpl implements ProvideTimeAsyncService {
    @Override
    public String getTimeFuture(String string) {
        return string+"_"+LocalDateTime.now();
    }

    @Override
    public String getTimeCallback(String string) {
        return string+"_"+LocalDateTime.now();
    }
}
