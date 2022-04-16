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
public class Usuario {
    private Contraseña contraseña;
    private String email;
    private String name;
    private String apellidos;
    private String nombreUsuario;
    
    /**
     *
     * @param contraseña
     * @param email
     * @param name
     * @param apellidos
     * @param nombreUsuario
     */
    
    public Usuario(Contraseña contraseña, String email, String name, String apellidos, String nombreUsuario){
        this.name = name;
        this.contraseña=contraseña;
        this.apellidos=apellidos;
        this.email=email;
        this.nombreUsuario = nombreUsuario;
    }
    
    public Usuario(String nombreUsuario, Contraseña contraseña){
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
    }

    public Contraseña getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContraseña(Contraseña contraseña) {
        this.contraseña = contraseña;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}
