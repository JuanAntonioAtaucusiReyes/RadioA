package com.antonio.radio.principal;

import com.antonio.radioA.modelos.Cancion;
import com.antonio.radioA.modelos.Misfavoritos;
import com.antonio.radioA.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion micancion = new Cancion();
        micancion.setTitulo("Numb");
        micancion.setCantante("Linkin Park");


        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela aguilar");
        miPodcast.setTitulo("cafe.tech");
// podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }
// cancion
        for (int i = 0; i < 100; i++) {
            micancion.meGusta();
        }
        for (int i = 0; i < 200; i++) {
            micancion.reproduce();
        }

        System.out.println(micancion.getTotalDeReproducciones());
        System.out.println(micancion.getTotalDeMegusta());

        Misfavoritos misfavoritos = new Misfavoritos();
        misfavoritos.adiciona(miPodcast);
        misfavoritos.adiciona(micancion);
    }
}