package com.NewProject;

public class CarManager {
    public static void main(String[] args) {

       Car prius = new PassengerCar("Toyota Prius",2008,15000,1200, Color.BLACK);



        Car renualt = new Bus("renualt Laguna", 2000,9700,1600, Color.WHITE);
        Car renualt2 = new Bus("renualt Laguna", 2000,9700,1600, Color.WHITE);


        prius.addDistance(1000);
        prius.addDistance(2000);
        prius.addDistance(20.5);
        prius.addDistance(15000);
        renualt.addDistance(15000);

        System.out.println(prius);
        System.out.println(renualt);


/*
        System.out.println(prius.equals(renualt));
        System.out.println(renualt.equals(renualt2));
*/
        System.out.println(prius.isReadyToService());
        System.out.println(renualt.isReadyToService());


    }
}
