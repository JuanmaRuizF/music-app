/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;


/**
 *
 * @author Scrany1
 */
public class Contraseña {
    private String contraseña;
    
    public Contraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contraseña other = (Contraseña) obj;
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }
    
    public boolean valid(){
        //hace método para que la contraseña esté bien
        return true;
    }
    
}
