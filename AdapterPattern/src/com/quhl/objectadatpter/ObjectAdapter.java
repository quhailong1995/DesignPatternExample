package com.quhl.proxy.objectadatpter;

import com.quhl.common.Source;
import com.quhl.common.Targetable;
import com.quhl.proxy.common.Source;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.print("this is the targetable method!");
    }
}

class Text{
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new ObjectAdapter(source);
        targetable.method1();
        targetable.method2();
    }
}