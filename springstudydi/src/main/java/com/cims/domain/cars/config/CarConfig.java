package com.cims.domain.cars.config;

import com.cims.aops.CarAOP;
import com.cims.domain.cars.MarkCarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * @Author kwliu
 * @Description 用来作为配置类
 * @Date 2018/4/11
 * @Modified
 */
@Configuration
@ComponentScan(basePackageClasses = MarkCarConfig.class)
@EnableAspectJAutoProxy
@PropertySource("classpath:app.properties")
public class CarConfig {

    @Autowired
    private Environment env;

    @Bean
    public CarAOP getCarAOP() {
        return new CarAOP();
    }
}
