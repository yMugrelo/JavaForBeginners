package org.Murilo.capitulo04;

public class ChkNum {
    //Retorna true se x for par
    boolean isEven(int x){
        if((x % 2) == 0){
            return true;
        }else return false;
    }
}

class ParmDemo{
    static void main(String[] args) {
        ChkNum n = new ChkNum();

        if(n.isEven(10)) System.out.println("10 is even.");
        if(n.isEven(25)) System.out.println("25 is even.");
        if(n.isEven(22)) System.out.println("22 is even.");


    }
}
