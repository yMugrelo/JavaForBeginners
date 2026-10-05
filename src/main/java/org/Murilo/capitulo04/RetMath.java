package org.Murilo.capitulo04;

public class RetMath {
    static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

        int range1, range2;

        // Atribuindo valores aos campos do objeto minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range01();
        range2 = sportscar.range01();

        System.out.println("Minivan can carry " + minivan.passengers +
                            " with range of " + range1 + " Miles");

        System.out.println("Sportscar can carry " + sportscar.passengers
                            +  " With a range of " + range2 + " Miles");


    }
}
