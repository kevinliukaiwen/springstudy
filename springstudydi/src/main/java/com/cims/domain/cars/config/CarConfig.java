package com.cims.domain.cars.config;

import com.cims.domain.cars.Car;
import com.cims.domain.cars.impl.Audi;
import com.cims.domain.cars.impl.BMW;
import com.cims.domain.cars.impl.MarkCarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author kwliu
 * @Description 仅仅只是用来作为配置类
 * @Date 2018/4/11
 * @Modified
 */
@Configuration
@ComponentScan(basePackageClasses = MarkCarConfig.class)
public class CarConfig {

}
