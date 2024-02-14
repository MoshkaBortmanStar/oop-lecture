package org.example;

public enum SingleMy {

    INSTANCE;

    public void doSomething(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        SingleMy.INSTANCE.doSomething("I'm doing something");
    }
}
