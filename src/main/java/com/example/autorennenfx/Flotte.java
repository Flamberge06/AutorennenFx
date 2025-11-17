package com.example.autorennenfx;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Flotte {
    private ArrayList<Fahrzeug> fahrzeug;

    public Flotte() {
        fahrzeug = new ArrayList<>();
        fahrzeug.add(new Auto(100, Color.RED));
        fahrzeug.add(new Auto(200, Color.BLUE));
        fahrzeug.add(new Fahrrad(300, Color.GREEN));
    }

    public void getFahrzeug() {
        return ;
    }

    public int getAnzahl(){

        return 0;
    }

    public Point2D getPoint(int i){

        return null;
    }

    public void beschleunigen(int i){

    }
    public void bremsen(int i){

    }
    public void hupen(int i){

    }

}
