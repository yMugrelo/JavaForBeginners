package org.Murilo.capitulo03_instrucoes;

public class ContToLabel {
    static void main(String[] args) {
        outerloop:
            for(int i = 0; i <10; i++){
                System.out.println();
                System.out.print("\nouter loop pass " + i +
                        " Inner loop: ");

                for(int j = 0; j < 10; j++){
                    if(j >= 5) continue outerloop;
                    System.out.print(j);
                }

            }
    }
}
