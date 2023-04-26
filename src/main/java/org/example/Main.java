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

        Greeting gm2 = name -> {
            System.out.println(name);
        };
        gm2.hello("Betty");

        Printer prt = () -> System.out.println("Message");
        prt.printOut();

Printer mrt = ()-> System.out.println("Next");
Printer crt = new Printer() {
    @Override
    public void printOut() {
        System.out.println("Crt Message");
    }
};

    }

}

