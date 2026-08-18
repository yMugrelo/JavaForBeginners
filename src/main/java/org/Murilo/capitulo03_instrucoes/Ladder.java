package org.Murilo.capitulo03_instrucoes;


// Demonstra uma escada if-else-if.
public class Ladder {
    static void main(String[] args) {

        for(int i = 0; i < 6; i++){
            if(i==1){
                System.out.println("i is one!");
            }
            else if(i==2){
                System.out.println("i is two!");
            }
            else if(i==3){
                System.out.println("i is three!");
            } else System.out.println("i is not between 1 and 3!");
        }
    }
}
