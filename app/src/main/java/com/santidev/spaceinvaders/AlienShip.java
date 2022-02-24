package com.santidev.spaceinvaders;

import android.util.Log;

public class AlienShip {

    // variables de clase
    private static int numShips;
    private int shieldStrength;
    public String shipName;

    //constructor
    public AlienShip(){
        this.setShieldStreng(100);

        AlienShip.numShips++;
    }

    public int getShieldStreng() {
        return this.shieldStrength;
    }

    private void setShieldStreng(int shieldStrength) {
        if(shieldStrength < 0 || shieldStrength > 100){
            return;
        }
        this.shieldStrength = shieldStrength;
    }

    public static int getNumShips() {
        return numShips;
    }

    //Metodos
    public void detectHit(){
        this.shieldStrength -=25;
        Log.i("Hit detected", "BOOOOM!!");
        if(this.shieldStrength <= 0){
            destroyShip();
        }
    }

    private void destroyShip(){
        AlienShip.numShips--;
        Log.i("Explosion final", this.shipName + " ha sido destruida");
    }
}
