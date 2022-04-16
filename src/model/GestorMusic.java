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
public class GestorMusic {
    public ArrayList<Usuario>users;
    public ArrayList<Playlist>playlists;
    public ArrayList<Cancion>canciones;
    public ArrayList<Album>albumes;
    
    public GestorMusic(){
        users=new ArrayList<Usuario>();
        playlists=new ArrayList<Playlist>();
        canciones=new ArrayList<Cancion>();
        albumes=new ArrayList<Album>();
        
    }
    
    public void addPlaylist(String nombrePlaylist,String descripcion,Portada caratula, boolean privada,int valoracion){
        playlists.add(new Playlist(nombrePlaylist,descripcion,caratula,privada,valoracion));
    }
    
    public void addCancion(String nombreCancion,int duracion,String nombreArtista, Genero generoCancion,Album albumCancion){
        canciones.add(new Cancion(nombreCancion,duracion,nombreArtista,generoCancion,albumCancion));
    }
    
    public void addAlbum(String nombreAlbum, String nombreArtista, Genero genero){
        albumes.add(new Album(nombreAlbum,nombreArtista, genero));
    }
    
    public void addAlbum(Album album){
        albumes.add(album);
    }
    
    public void addUser(Contraseña contraseña,String email, String name, String apellidos, String nombreUsuario){
        users.add(new Usuario(contraseña,email,name,apellidos,nombreUsuario));
    }
    
    public void removePlaylist(String s1){
        playlists.remove(s1);  
    }
    
    public void removeCancion(Cancion cancion){
        canciones.remove(cancion);
    }
    
    
}
