package com.example.AoP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
//Advice->Before,After when you want to call
//PointCut-> Where you want to call
public class Aspects {
    @Before("execution(public void show())")
    public void entry(){
        System.out.println("Hi!");
    }
    @After("execution(public void show())")
    public void exit(){
        System.out.println("Bye!");
    }
}
