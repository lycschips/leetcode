package com.chips.design.learn.thread;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

public class TestProducerConsumer {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        Runnable r1=new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable r2=new Runnable() {
            @Override
            public void run() {

            }
        };

        new Thread(r1).start();



    }
}

class MyStack {

    String[] data = {"", "", "", "", "", ""};
    int index;

    public synchronized void push(String s) {
        data[index] = s;
        index++;
        System.out.print(s + " pushed------> ");
        print();
    }

    public synchronized void pop() {
        index--;
        String o = data[index];
        data[index] = "";
        System.out.print(o + " pop---------> ");
        print();
    }

    public void print() {
        for (String datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}




