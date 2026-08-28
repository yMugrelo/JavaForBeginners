package org.Murilo.capitulo09;

public class NestTrys {
    static void main(String[] args) {
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " +
                            denom[i] + " is " + numer[i] / denom[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Can't divide by zero");
                }


            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Fatal error - program terminated");
        }

    }
}
