package com.example.autorennenfx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

import java.io.File;

public class Auto extends Fahrzeug{
    public Auto(int y, Color farbe){
        super(y, farbe, 55, 35, 0.5, 1.5);
    }

    public String getGeschwindigkeit(){
        return "";
    }

    public void hupen(){
        Media media = new Media(new File(getClass().getResource("hupe.wav").getPath()).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void anzeigen(GraphicsContext graphicsContext){

    }

}
