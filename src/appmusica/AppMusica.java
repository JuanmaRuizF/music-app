/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmusica;
import model.*;
import gui.AppMusicaForm;
import gui.*;
/**
 *
 * @author Scrany1
 */
public class AppMusica {
    
    /**
     * @param args the command line arguments
     */
    public static GestorMusic gestorMusic;
    public static void main(String[] args) {
        gestorMusic = new GestorMusic();
        String s1 = "playlist1";
        String nada="";
        Portada por = new Portada(nada);
        gestorMusic.addPlaylist(s1,"Prueba descripcióm",por, false,0);//Creamos dos playlists de ejemplo para cuando se abra el gestor de música
        gestorMusic.addPlaylist("playlist2","buena musica",por,false,0);
        
        // TODO code application logic here
        AppMusicaForm appMusicaForm=new AppMusicaForm(gestorMusic);
        appMusicaForm.setVisible(true);
        
        String cont="invitado";
        Contraseña contra=new Contraseña(cont);
        String ent="12345";
        Usuario invitado = new Usuario(ent,contra);
       
    }
    
}
