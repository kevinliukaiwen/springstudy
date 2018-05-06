package com.cims.domain.cars.config;

import com.cims.domain.cars.Car;
import com.cims.domain.cars.impl.Audi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/11
 * @Modified
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CarConfig.class)
public class CarConfigTest {

//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
    @Autowired
    @Qualifier("audi")
    private Car car;

    @Test
    public void testCarNotNull() {
        Assert.assertNotNull(car);
    }
    @Test
    public void testCarConfig() {
        Assert.assertEquals("我的id是:audiproperty",car.getCarname());
    }
}