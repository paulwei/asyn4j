package com.googlecode.asyn4j.springbean;

/**
 * Created by weihonglin on 16/6/15.
 */
public class TestService {
    public Girl getGirlByBoy(Boy boy,int i){
           return boy.getName().equals("lilei")?new Girl(12,"hanmeimei",i):new Girl(15,"lucy",i);
    }
}
