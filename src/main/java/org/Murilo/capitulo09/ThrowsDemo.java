package org.Murilo.capitulo09;

public class ThrowsDemo {
    public static char prompt(String str) throws java.io.IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    static void main(String[] args) {
        char ch;
        try{
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException e){
            System.out.println("I/O exception ocurred");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }

}
