package org.Murilo.capitulo03_instrucoes;
//Importancia de onde o rotulo eh inserido
public class Break6 {
    static void main(String[] args) {
        int x = 0, y = 0;

        stop1:
            for(x = 0; x < 5; x++){
                for(y = 0; y < 5; y++){
                    if(y == 2) break stop1;
                    System.out.println("X and Y: " + x + " " + y);

            }
    }

        for(x = 0; x<5; x++)stop2:{
            for(y = 0; y < 5; y++){
                if(y == 5)break stop2;
                System.out.println("X and Y: " + x + " " + y);
            }
        }
    }

}
