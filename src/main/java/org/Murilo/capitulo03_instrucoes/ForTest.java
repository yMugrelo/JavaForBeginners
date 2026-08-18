package org.Murilo.capitulo03_instrucoes;

public class ForTest {
    static void main(String[] args) throws java.io.IOException{
        int i;

        System.out.println("Press S to stop!");

        for(i = 0; (char) System.in.read() != 'S'; ){
            System.out.println("Pass #" + i);
            i++;
        }
    }
}
