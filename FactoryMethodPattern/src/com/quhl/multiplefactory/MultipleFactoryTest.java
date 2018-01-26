package com.quhl.proxy.multiplefactory;

import com.quhl.commonfactory.Sender;
import com.quhl.proxy.commonfactory.Sender;

public class MultipleFactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}