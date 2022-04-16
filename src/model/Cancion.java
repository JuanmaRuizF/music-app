/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Scrany1
 */
public class Cancion {

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setGeneroCancion(Genero generoCancion) {
        this.generoCancion = generoCancion;
    }

    public void setAlbumCancion(Album albumCancion) {
        this.albumCancion = albumCancion;
    }
    private String nombreCancion;
    private int duracion;
    private String nombreArtista;
    private Genero generoCancion;
    private Album albumCancion;
    
    public String getNombreCancion() {
        return nombreCancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public Genero getGeneroCancion() {
        return generoCancion;
    }

    public Album getAlbumCancion() {
        return albumCancion;
    }
  
    
    public Cancion(String nombreCancion,int duracion,String nombreArtista,Genero generoCancion,Album albumCancion){
        this.albumCancion=albumCancion;
        this.duracion=duracion;
        this.generoCancion=generoCancion;
        this.nombreArtista=nombreArtista;
        this.nombreCancion=nombreCancion;
    }
    
}
