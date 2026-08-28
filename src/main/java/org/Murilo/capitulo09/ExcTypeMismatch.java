package org.Murilo.capitulo09;

public class ExcTypeMismatch {
    static void main(String[] args) {
        int nums[] = new int[4];


        System.out.println("Before exception is generated");
        try{
            nums[7] = 10;
            System.out.println("This won't be displayed!");
        }
        catch (ArithmeticException e) {
            System.out.println("Index out-of-bounds");

        }
        System.out.println("After catch statement!");
    }
}
