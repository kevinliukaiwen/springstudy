package com.cims.domain.cars.impl;

import com.cims.domain.cars.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/3
 * @Modified
 */
@Component
public class BMW implements Car {
    /**
     * 返回宝马名称
     * @return String
     */
    @Override
    public String getCarname() {
        return "BMW";
    }
}
