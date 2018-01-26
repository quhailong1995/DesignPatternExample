package com.quhl.proxy.staticfactory;

import com.quhl.commonfactory.Sender;
import com.quhl.proxy.commonfactory.Sender;

public class StaticFactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
