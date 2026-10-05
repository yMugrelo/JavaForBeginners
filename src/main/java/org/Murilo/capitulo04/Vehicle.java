package org.Murilo.capitulo04;

public class Vehicle {
    public int passengers;
    public int fuelcap;
    public int mpg;

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;


    }


    public void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }

    public int range01(){
        return fuelcap * mpg;
    }

    public double fuelneeded(int miles){
        return (double) miles/mpg;
    }
}

class VehicleDemo {
    static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

        int range1, range2;


        //Atribui valores aos campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Atribui valores aos campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry: " + minivan.passengers +
                            " people with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers +
                            " people with a range of " + range2);


    }


}

class VehConsDemo{
    static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons; int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons +
                " gallons of fuel.");
        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");

    }
}
