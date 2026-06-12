package org.Murilo.capitulo02;

/*
This program attempts to declare a variable
in an inner scope with the same name as one
defined in an outer scope.

*** This program will not be compiled.
 */
public class NestVar {
    static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++){
            System.out.println("This is count: " + count);


            for(count = 0; count < 2; count++){
                System.out.println("This program is in error!");
            }
        }
    }
}
