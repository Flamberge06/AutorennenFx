package com.example.autorennenfx;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Fahrzeug {
    private Double x;
    private Double y;
    private int laenge;
    private Color farbe;
    protected double geschwindigkeit;
    private double maxGeschwindigkeit;
    private double beschleunigung;
    private double bremskraft;

    public Fahrzeug(int y, Color farbe, int laenge, double geschwindigkeit, double maxGeschwindigkeit, double beschleunigung, double bremskraft) {

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public Point2D getPoint(){

        return null;
    }

    public Color getFarbe(){
        return farbe;
    }
    public void beschleunigen(){

    }
    public void bremsen(){

    }
    public void fahren(){

    }
    public void kollisionserkennung(double fensterbreite){

    }

}
