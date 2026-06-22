package org.Murilo.capitulo02;

public class UseCast {
    static void main(String[] args) {
        int i = 0;
        for( ;i < 5; i++){
            System.out.println(i + "/ 3: " + i / 3 );
            System.out.println(i + "/ 3 With fractions: "+ (double) i / 3);
            System.out.println();
        }
    }
}
