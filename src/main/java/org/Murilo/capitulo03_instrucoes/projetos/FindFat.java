package org.Murilo.capitulo03_instrucoes.projetos;

public class FindFat {

    static void main(String[] args) {

        for(int i = 0; i <= 100; i++){
            System.out.println();
            System.out.println("Factors of " + i + ":");
            for(int j = 2; j <= i; j++){
                if((i % j) == 0){
                    System.out.print(j + " ");
                }
            }
        }
    }
}
