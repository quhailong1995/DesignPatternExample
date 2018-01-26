package com.quhl.proxy.classadatpter;

import com.quhl.common.Source;
import com.quhl.common.Targetable;

/**
 * 类的适配器模式
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里，
 */
public class ClassAdatpter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }


}
class Text {
    public static void main(String[] args) {
        Targetable target = new ClassAdatpter();
        target.method1();
        target.method2();
    }
}
