package org.Murilo.capitulo13;



class BoundsDemo {
    static void main(String[] args) {
        NumericFns<Integer> IOb =
                new NumericFns<Integer>(5);

        System.out.println("Reciprocal of IOb is: " + IOb.reciprocal());
        System.out.println("Fraction of IOb is: " + IOb.fraction());

        System.out.println();

        //Double tambem pode ser usado!

        NumericFns<Double> DOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dob is " + DOb.reciprocal());
        System.out.println("Fractional component of dob is " + DOb.fraction());



    }

}
