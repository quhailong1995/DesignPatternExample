package com.quhl.lterator;

public interface Collection {

    public com.quhl.lterator.Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}