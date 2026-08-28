package org.Murilo.capitulo09;

public class ThrowDemo {
    static void main(String[] args) {
        try{
            System.out.println("Before Throw");
            throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught!");
        }
        System.out.println("After try/catch block");
    }
}
