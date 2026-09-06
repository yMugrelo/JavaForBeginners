package org.Murilo.capitulo13;

public class RawDemo {
    static void main(String[] args) {
        //Cria um objeto Gen para Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        //Cria um objeto Gen para String
        Gen<String> strOb = new Gen<String>("Generics Test");

        /*
        Cria um objeto gen de tipo bruto e da a ele
        um valor double
         */
        Gen raw = new Gen(new Double(98.6));

        //Essa coercao e necessaria porque o tipo e desconhecido
        double d = (double) raw.getOb();
        System.out.println("Value: " + d);

    }
}
