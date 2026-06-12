package org.Murilo.capitulo02.Projects;

public class MyLogicalOpTable {
    static void main(String[] args) {


        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        for(int i = 0; i < 4; i++){
            boolean p = (i / 2) == 1;
            boolean q = (i % 2) == 1;


            int pInt = p ? 1 : 0;
            int qInt = q ? 1 : 0;

            int and = (p && q) ? 1 : 0;
            int or = (p || q) ? 1 : 0;
            int xor = (p ^ q) ? 1 : 0;
            int notP = (!p) ? 1: 0;

            System.out.println(
                    pInt + "\t" + qInt + "\t" + and + "\t" + or + "\t" + xor + "\t" + notP
            );
        }
    }
}
