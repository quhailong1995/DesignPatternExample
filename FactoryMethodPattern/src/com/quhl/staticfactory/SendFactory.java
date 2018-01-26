package com.quhl.proxy.staticfactory;

import com.quhl.commonfactory.MailSender;
import com.quhl.commonfactory.Sender;
import com.quhl.commonfactory.SmsSender;
import com.quhl.proxy.commonfactory.MailSender;
import com.quhl.proxy.commonfactory.Sender;
import com.quhl.proxy.commonfactory.SmsSender;

public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}