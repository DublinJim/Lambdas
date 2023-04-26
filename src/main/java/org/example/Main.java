package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");


        Greeting gm = new Greeting() {
            @Override
            public void hello(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.hello("Bob");
    }
}