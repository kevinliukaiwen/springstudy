package com.cims.domain.cars.impl;

import com.cims.domain.cars.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/3
 * @Modified
 */
@Component
@Scope("prototype")
public class Audi implements Car {
    //奥迪编号
    private String id;

    /**
     * 返回奥迪名称
     * @return String
     */
    @Override
    public String getCarname() {
        return "我的id是:" + id;
    }

    public Audi(String id) {
        this.id = id;
    }
}
