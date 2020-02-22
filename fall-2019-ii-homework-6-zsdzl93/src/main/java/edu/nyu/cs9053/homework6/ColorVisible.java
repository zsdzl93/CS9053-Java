package edu.nyu.cs9053.homework6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

/**
 * User: blangel
 * Date: 10/11/17
 * Time: 8:43 AM
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ColorVisible {
}
