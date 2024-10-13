package com.antonio.radioA.modelos;

public class Misfavoritos {
    public void adiciona(Audio audio){
        if (audio.getClasificacion() >=8){
            System.out.println(audio.getTitulo() +"es uno de los favoritos ");
        } else {
            System.out.println(audio.getTitulo() + "tambien de los favoritos");
        }
    }
}
