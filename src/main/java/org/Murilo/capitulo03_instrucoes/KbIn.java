package org.Murilo.capitulo03_instrucoes;

public class KbIn {
    static void main(String[] args)
    throws java.io.IOException{
            char ch;

            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();

            System.out.println("Your key is: " + ch);
        }
    }

