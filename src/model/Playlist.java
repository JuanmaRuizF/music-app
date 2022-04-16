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
public class Playlist {
    private String nombrePlaylist;
    private String descripcion;
    private Portada caratula;
    private boolean privada;
    public int valoracion;
    public ArrayList<Cancion>cancionesPlay;
    public ArrayList<Album>albumesPlay;
    
    public Playlist(String nombrePlaylist, String descripcion,Portada caratula, boolean privada, int valoracion){
        this.nombrePlaylist = nombrePlaylist;
        this.descripcion=descripcion;
        this.caratula=caratula;
        this.privada=privada;
        this.valoracion = valoracion;
        cancionesPlay = new ArrayList<Cancion>();
        albumesPlay = new ArrayList<Album>();
        
    }
    

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Portada getCaratula() {
        return caratula;
    }

    public int getValoracion() {
        return valoracion;
    }
    
    

    public boolean isPrivada() {
        return privada;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCaratula(Portada caratula) {
        this.caratula = caratula;
    }


    public void setPrivada(boolean privada) {
        this.privada = privada;
    }
    
    public void setValoracion(int valoracion){
        this.valoracion = valoracion;
    }
    public void addCancionPlaylist(Cancion cancion){
        cancionesPlay.add(cancion);
    }
    
    public void addAlbumPlaylist(Album album){
        albumesPlay.add(album);
    }
    
    public void removeCancionPlaylist(Cancion cancion){
        cancionesPlay.remove(cancion);
    }
    
    public void removeAlbumPlaylist(Album album){
        albumesPlay.remove(album);
        
    }
    
    public int getNumSong(ArrayList<Cancion> cancionesPlay){
        return cancionesPlay.size();
    }
    
    public int getNumAlbum(ArrayList<Album> albumesPlay){
        return albumesPlay.size();
    }
    
    
    
    
}
