package com.cims.domain;


import com.cims.domain.cars.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/3
 * @Modified
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/spring-application.xml")
public class CarTest {
    @Autowired
//    @Qualifier("audi")
    Car car;

    @Test
    public void getCarname() throws Exception {
        assert("Audi".equals(car.getCarname()));
    }

}