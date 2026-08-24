package org.Murilo.capitulo03_instrucoes;

public class WhileDemo {
    static void main(String[] args) {
        char ch;

        ch = 'a';
        while (ch <= 'z'){
            System.out.print(ch + ", ");
            ch++;
        }
    }
}
