package com.cims.domain.cars.config;

import com.cims.domain.cars.Car;
import com.cims.domain.cars.impl.Audi;
import com.cims.domain.cars.impl.BMW;
import com.cims.domain.cars.impl.MarkCarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * @Author kwliu
 * @Description 仅仅只是用来作为配置类
 * @Date 2018/4/11
 * @Modified
 */
@Configuration
@ComponentScan(basePackageClasses = MarkCarConfig.class)
@PropertySource("classpath:app.properties")
public class CarConfig {

    @Autowired
    private Environment env;


//    @Bean(name="getAudiFromProperrty")
//    public Car getAudi() {
//        String id = env.getProperty("audiId");
//        return new Audi(id);
//    }
}
