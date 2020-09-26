package com.example.victoralfonso.mascotas;

public class Mascota {
    private String Nombre;
    private int Foto;
    private int likes;

    public Mascota(String nombre, int foto, int likes) {
        Nombre = nombre;
        Foto = foto;
        this.likes = likes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
