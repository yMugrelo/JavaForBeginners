package org.Murilo.capitulo02;

public class ScopeDemo {
    static void main(String[] args) {
        int x;

        x = 10;
        if(x==10){
            int y;
            y = 20;

            System.out.println("x and y:"+ x + " " + y);
            x = y *2 ;
            //Y ends here!!
        }
        System.out.println("x is: " + x);
    }
}
