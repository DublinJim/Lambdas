package org.example;

import java.util.stream.IntStream;

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

        Greeting gm2 = x -> System.out.println(x);
        gm2.hello("Betty");

        Printer prt = () -> System.out.println("Message");
        prt.printOut();

        Printer mrt = () -> System.out.println("Next");
        Printer crt = new Printer() {
            @Override
            public void printOut() {
                System.out.println("Crt Message");
            }
        };
        Printer mre = () -> System.out.println("Priceless");
        mre.printOut();
        crt.printOut();
        mrt.printOut();
        Printer opn = new Printer() {
            @Override
            public void printOut() {
                System.out.println("Fubar");
            }
        };
        opn.printOut();
        //------------------------------For Next ---------------------------

        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + i);
            System.out.println("Next");
        }
        System.out.println("\n\n\nNow streamed \n");
        //Stream version

        IntStream.range(0, 10).forEach(i -> {
            System.out.println("Number " + i);
            System.out.println("Next");
        });
    }


}

