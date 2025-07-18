package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Demo {
    
    @PostConstruct
    private void init() {
        log.info("----------- start ----------");
        log.info("start.");
    }

    public void process(String name) {
        var rs = String.format("==%s==",name);
        log.info("{}");
    }
 }
