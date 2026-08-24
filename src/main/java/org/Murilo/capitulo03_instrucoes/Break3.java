package org.Murilo.capitulo03_instrucoes;

public class Break3 {
    static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println("Outer loop count: " + i);
            System.out.print("\t Inner loop count: ");


            int t = 0;
            while(t < 100){
                if(t == 10)break;
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loop complete.");

    }
}
