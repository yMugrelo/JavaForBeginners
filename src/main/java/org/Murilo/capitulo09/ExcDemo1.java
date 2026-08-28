package org.Murilo.capitulo09;

public class ExcDemo1 {
    static void main(String[] args) {
        int nums[] = new int[4];

        try{
            System.out.println("Before exception is generated!");
            nums[7] = 10;
            System.out.println("This won't be displayed");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bond!");

        }
        System.out.println("After catch statement!");
    }
}
