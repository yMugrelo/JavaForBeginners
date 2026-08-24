package org.Murilo.capitulo03_instrucoes;

public class DwDemo {
    static void main(String[] args) throws java.io.IOException{
        char ch;

        do{
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        } while(ch != 'q');
    }
}
