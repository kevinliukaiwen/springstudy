package com.cims.Annotations;

import java.lang.annotation.*;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/26
 * @Modified
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CarAction {
    String name();
}
