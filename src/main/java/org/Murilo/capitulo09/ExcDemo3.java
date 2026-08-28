package org.Murilo.capitulo09;

public class ExcDemo3 {
    static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++){
            try {
                int div = numer[i]/denom[i];
                System.out.println(numer[i] + "/" +  denom[i] + " = " + div);
            }
            catch (ArithmeticException e){
                System.out.println("Can't divide by zero!");

            }
        }
    }
}
