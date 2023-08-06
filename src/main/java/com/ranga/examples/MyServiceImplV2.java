package com.ranga.examples;

import org.springframework.stereotype.Service;

@Service("myServiceImplV2")
public class MyServiceImplV2 implements MyService{
    public MyServiceImplV2() {
        System.out.println("MyServiceImplV2");
    }

    @Override
    public void m2() {
        System.out.println("V2 M2");
    }
}
