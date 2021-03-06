package com.jianf.commons.aop.annotation;

import java.lang.annotation.*;

/**
 * 方法调用时加日志
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BeforeAspectLog {
    String collectionName();
}
