package com.mycompany.gun;

public class GameHero {

    private static GameHero uniqueInstance;
    private int ShootingPoint;

    private GameHero() {
        System.out.println("Vector, the hero, has born!");

    }

    public static GameHero getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GameHero();
        }
        return uniqueInstance;
    }

    public void getAmmunition() {
        Gun myGun = new Tommygun();
        System.out.println(myGun.getDescription()
                + " " + myGun.weight() + " kg");

        Gun my2ndGun = new AssaultRiffle();
        my2ndGun = new silencer(my2ndGun);
        my2ndGun = new Magzine(my2ndGun);
        System.out.println(my2ndGun.getDescription()
                + " " + my2ndGun.weight() + " kg");

        Gun friendsGun = new Tommygun();
        friendsGun = new silencer(friendsGun);
        friendsGun = new CarrierCase(friendsGun);
        System.out.println(friendsGun.getDescription()
                + " " + friendsGun.weight() + " kg");
        
        Gun VectorHero = new GreenScope();
        VectorHero = new AssaultRiffle();
        VectorHero = new silencer(my2ndGun);
        VectorHero = new Magzine(my2ndGun);
        System.out.println(my2ndGun.getDescription()
                + " " + my2ndGun.weight() + " kg" );
    }

}
