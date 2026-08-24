package org.Murilo.capitulo03_instrucoes;

public class Break2 {
    static void main(String[] args) throws java.io.IOException{
        char ch;

        for( ; ; ){
            ch = (char) System.in.read();
            if(ch == 'q')break;
        }
        System.out.println("You pressed q!");
    }
}
