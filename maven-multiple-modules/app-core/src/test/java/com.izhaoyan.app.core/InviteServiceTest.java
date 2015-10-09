package com.izhaoyan.app.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by yangyuan on 15-8-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {BootStrap.class})
@WebAppConfiguration
public class InviteServiceTest {

    @Autowired
    GreetingService greetingService;

    @Test
    public void test() {
 //       issuePrizeService.sendPrizeWhenRegist(5377811,"78a8a704bc08aa88016d9d76164bc915");
        System.out.println("I'm running....");
        Assert.assertEquals("Hello , zhaoyan2", greetingService.sayHello());
    }
}
