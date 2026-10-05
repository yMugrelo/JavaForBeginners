package org.Murilo.capitulo04.projetos;

import org.Murilo.capitulo04.Vehicle;

public class AddMeth {
    static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

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
