package com.quhl.interpreter;

/**
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 */
public interface Expression {
    public int interpret(Context context);
}
