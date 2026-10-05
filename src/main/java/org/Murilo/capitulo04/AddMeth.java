package org.Murilo.capitulo04;

public class AddMeth {
    static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 16, 12);

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();

    }
}
