package org.Murilo.capitulo02;

public class PromDemo {
    static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b);

        System.out.println("I and B: " + i + " " + b);

    }
}
