package com.santidev.spaceinvaders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlienShip girlShip = new AlienShip();
        AlienShip boyShip = new AlienShip();

        Log.i("Numero de naves:", "Hay " + AlienShip.getNumShips() + " naves en pantalla.");

        girlShip.shipName = "Samsa Stark";
        boyShip.shipName = "Indiana Jones";

        Log.i("Vida", "La vida de " + girlShip.shipName + " es de "+ girlShip.getShieldStreng());
        Log.i("Vida", "La vida de " + boyShip.shipName + " es de "+ boyShip.getShieldStreng());

        girlShip.detectHit();
        Log.i("Vida", "La vida de " + girlShip.shipName + " es de "+ girlShip.getShieldStreng());
        Log.i("Vida", "La vida de " + boyShip.shipName + " es de "+ boyShip.getShieldStreng());

        boyShip.detectHit();
        boyShip.detectHit();
        boyShip.detectHit();
        Log.i("Vida", "La vida de " + girlShip.shipName + " es de "+ girlShip.getShieldStreng());
        Log.i("Vida", "La vida de " + boyShip.shipName + " es de "+ boyShip.getShieldStreng());

        boyShip.detectHit(); //4to impacto deberia morir
        Log.i("Vida", "La vida de " + girlShip.shipName + " es de "+ girlShip.getShieldStreng());
        Log.i("Vida", "La vida de " + boyShip.shipName + " es de "+ boyShip.getShieldStreng());
        Log.i("Numero de naves:", "Hay " + AlienShip.getNumShips() + " naves en pantalla.");


    }
}