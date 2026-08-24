package org.Murilo.capitulo03_instrucoes;

//Usa Continue
public class ContDemo {
    static void main(String[] args) {
        int i;

        for(i = 0; i < 15; i++){
            if((i%2) != 0)continue;
            System.out.println(i);
        }
    }
}
