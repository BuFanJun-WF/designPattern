package com.wangfan;

import com.wangfan.demo3.Singleton_03;
import com.wangfan.demo5.Singleton_05;
import com.wangfan.demo6.Singleton_06;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射-暴力反射获取构造方法，破坏单例对象的唯一性
 */
public class Test_Reflect {

    @Test
    public void test01() {
        try {
            Class<Singleton_03> clazz = Singleton_03.class;

            // getDeclaredXxx: 不受权限控制的获取类的成员.
            Constructor<Singleton_03> declaredConstructor = clazz.getDeclaredConstructor(null);

            // 设置为true,就可以对类中的私有成员进行操作了
            declaredConstructor.setAccessible(true);

            Singleton_03 singleton03 = declaredConstructor.newInstance();
            Singleton_03 singleton03_1 = declaredConstructor.newInstance();
            System.out.println(singleton03 == singleton03_1);

            Class<Singleton_05> clazz05 = Singleton_05.class;
            Constructor<Singleton_05> declaredConstructor1 = clazz05.getDeclaredConstructor(null);
            declaredConstructor1.setAccessible(true);
            Singleton_05 singleton_05 = declaredConstructor1.newInstance();
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test02() throws Exception{
        // 获取枚举
        Singleton_06 instance = Singleton_06.getInstance();
        instance.setData(new Object());

        Class<Singleton_06> clazz = Singleton_06.class;
        Constructor<Singleton_06> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);

        //Cannot reflectively create enum objects
        //不可以用反射创建枚举对象
        Singleton_06 s1 = constructor.newInstance();

        System.out.println(s1);
    }
}
