/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import model.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
/**
 *
 * @author eduma
 */
public class GestorMusicFile {
    String name = "App.txt"; //Abrimos el fichero App 
     public void loadFromCancion(GestorMusic gestor){ //Cargar el fichero de canciones
            boolean igual = false;
            BufferedReader br = null;
            try{
                br = new BufferedReader(new FileReader(name));
                String texto = br.readLine();
                while(texto != null){
                    String[] res = texto.split("-");
                    int k = Integer.parseInt(res[1].trim());
                    Genero gen = Genero.GeneroEra(res[3].trim()); //Pasamos string a genero
                    Album n = new Album (res[4],res[3],gen);
                    int i;
                    for(i = 0; i < gestor.albumes.size(); i++){
                        if(gestor.albumes.get(i).getNombreAlbum().equals(res[4])){
                            igual = true;
                        }
                    }
                    if(igual){
                        igual = false;
                    }else{
                        gestor.addAlbum(n);
                        gestor.addCancion(res[0], k, res[2], gen, n); //TÍTULO CANCION - DURACIÓN - ARTISTA - GENERO - ALBUM
                    }
                    texto = br.readLine(); //Leer la siguiente línea
                }
            }catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
             }
            
            catch(Exception e){
                System.out.println("Error de lectura del fichero");
                e.printStackTrace();
            }finally {
                try{
                    if(br != null)
                        br.close();
                }
                catch (Exception e) {
                    System.out.println("Error al cerrar el fichero");
                    System.out.println(e.getMessage());
                }
            }
    }
    
}
