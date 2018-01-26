package com.quhl.proxy.multiplefactory;

import com.quhl.commonfactory.MailSender;
import com.quhl.commonfactory.Sender;
import com.quhl.commonfactory.SmsSender;
import com.quhl.proxy.commonfactory.MailSender;
import com.quhl.proxy.commonfactory.Sender;
import com.quhl.proxy.commonfactory.SmsSender;

/**
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}