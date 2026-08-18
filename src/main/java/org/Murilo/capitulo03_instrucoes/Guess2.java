package org.Murilo.capitulo03_instrucoes;

public class Guess2 {
    static void main(String[] args) throws java.io.IOException{
        char ch, answer = 'k';

        System.out.println("i'm thinking of a letter between A and Z");
        System.out.println("Can you guess it? ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("*** Right ***");
        else System.out.println("... Sorry you're wrong");
    }
}
