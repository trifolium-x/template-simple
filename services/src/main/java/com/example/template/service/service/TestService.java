package com.example.template.service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @title: TestService
 * @author: trifolium.wang
 * @date: 2024/2/1
 * @modified:
 */
@Slf4j
@Service
public class TestService {

    public String sayHello() {

        return "hello";
    }
}
