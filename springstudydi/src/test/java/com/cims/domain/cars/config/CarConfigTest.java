package com.cims.domain.cars.config;

import com.cims.domain.cars.Car;
import com.cims.domain.cars.impl.Audi;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/11
 * @Modified
 */
public class CarConfigTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);

    private Car car = (Car) applicationContext.getBean(Audi.class);

    @Test
    public void testCarNotNull() {
        Assert.assertNotNull(car);
    }
    @Test
    public void testCarConfig() {
        Assert.assertEquals("我的id是:audiproperty",car.getCarname());
    }
}