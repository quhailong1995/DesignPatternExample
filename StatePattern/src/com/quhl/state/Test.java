package com.quhl.state;

public class Test {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("method1");
        context.method();

        state.setValue("method2");
        context.method();
    }
}
