package org.Murilo.capitulo02;

public class CastDemo {
    static void main(String[] args) {
        int i;
        byte b;
        double x, y;
        char ch;

        x = 10.0;
        y = 2.0;

        i = (int) (x/y);
        System.out.println("Integer outcome of x/y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);

    }
}
