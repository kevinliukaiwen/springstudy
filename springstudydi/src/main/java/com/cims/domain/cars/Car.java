package com.cims.domain.cars;

import com.cims.domain.cars.config.CarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/3
 * @Modified
 */
public interface Car {
    /**
     * 返回汽车名字
     * @return String
     */
    abstract  String getCarname();


}
