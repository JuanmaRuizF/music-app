/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Scrany1
 */
public class Album {
    private String nombreAlbum;
    private String nombreArtista;
    private Genero genero; 
    public ArrayList<Cancion>cancionesAlbum;
    
    public Album(String nombreAlbum, String nombreArtista, Genero genero){
        this.nombreAlbum = nombreAlbum;
        this.genero=genero;
        this.nombreArtista=nombreArtista;
        cancionesAlbum = new ArrayList<Cancion>();
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public void addCancionAlbum(Cancion cancion){
        cancionesAlbum.add(cancion);
    }
    
}
