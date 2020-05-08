package com.company;

// Any part that implements the interface ESEngine
// can replace that part in any ship

public interface ESEngine{

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}
// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

 class ESUFOEngine implements ESEngine{

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString(){
        return "1000 mph";
    }

}

// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

class ESUFOBossEngine implements ESEngine{

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString(){
        return "2000 mph";
    }

}
