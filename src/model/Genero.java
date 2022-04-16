/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduma
 */
public enum Genero {Rap,Pop,Reggaeton,Rock,Clasica,Electronica,Jazz;
    

public static Genero GeneroEra(String gen){
    Genero devolver = Genero.Rock;
    switch(gen){
        case "Reggaeton":
            return Genero.Reggaeton;
            
        case "Pop":
            return  Genero.Pop;
        
        case "Rap":
            return Genero.Rap;
        
        case "Rock":
            return Genero.Rock;
        
        case "Clasica":
            return Genero.Clasica;
            
        case "Electronica":
            return Genero.Electronica;
            
        case "Jazz":
            return Genero.Jazz;
        
            
    }
    
    return devolver;
}

public static String GeneroEs (Genero gen){
    switch(gen){
        case Reggaeton:
            return "Reggaeton";
         
        case Pop:
            return "Pop";
        
        case Rap:
            return "Rap";
        
        case Rock:
            return "Rock";
        
        case Clasica:
            return "Clasica";
            
        case Electronica:
            return "Electronica";
            
        case Jazz:
            return "Jazz";
   
    }

    return "";
}
}




   
   

