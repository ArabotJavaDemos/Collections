package com.learnJava;

import java.util.LinkedList;

public class Stack<T> {

private LinkedList<T> list ;

Stack(){
    list = new LinkedList<T>();
}

void push(T t){
    list.addLast(t);
}

void pop(){
    list.removeLast();
}

T peak(){
    if(list.peek() == null){
        return null ;
    }else {
        return list.getLast();
    }
}

T test(){
    return list.poll();
}
    @Override
    public String toString() {
        return "" + list ;
    }
}
