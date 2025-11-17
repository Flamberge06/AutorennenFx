package com.example.autorennenfx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

import java.io.File;

public class Fahrrad extends Fahrzeug{

    public Fahrrad(int y, Color farbe) {
            super(y, farbe, 35, 7, 0.3, 0.7);
    }
    public void klingln(){
        Media media = new Media(new File(getClass().getResource("klingel.wav").getPath()).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void anzeigen(GraphicsContext graphicsContext){

    }
}
