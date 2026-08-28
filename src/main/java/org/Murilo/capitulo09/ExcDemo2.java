package org.Murilo.capitulo09;

class ExcTest{
    static void getException(){
        int nums[] = new int [4];

        System.out.println("Before exception is generated!");

        nums[7] = 10;

        System.out.println("This won't be displayed!");
    }
}

public class ExcDemo2 {
    static void main(String[] args) {
        try{
            ExcTest.getException();

            }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out-of-bounds!");

        }
        System.out.println("After catch statement!");
    }
}


