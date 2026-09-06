package org.Murilo.capitulo13;

public class WildcardDemo {
    static void main(String[] args) {
        NumericFns<Integer>IOb = new NumericFns<Integer>(5);

        NumericFns<Double> DOb = new NumericFns<Double>(-6.0);

        NumericFns<Long> LOb = new NumericFns<Long>(5L);

        System.out.println("Testing Iob and DOb");

        if(IOb.AbsEqual(DOb)){
            System.out.println("Absolute values are equal!");
        }else System.out.println("Absolute values are diferent!");
        System.out.println();

        System.out.println("Testing IOb and LOb");
        if(IOb.AbsEqual(LOb)){
            System.out.println("Absolute values are equal!");
        }else System.out.println("Absolute values are diferent!");

    }

}
