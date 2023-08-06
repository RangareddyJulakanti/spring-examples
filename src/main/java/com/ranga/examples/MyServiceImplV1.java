package com.ranga.examples;

import org.springframework.stereotype.Service;

@Service("myServiceImplV1")
public class MyServiceImplV1 implements MyService{
    public MyServiceImplV1() {
        System.out.println("MyServiceImplV1");
    }

    @Override
    public void m2() {
        System.out.println("V1 M2");
    }
}
