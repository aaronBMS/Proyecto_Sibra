package com.lemon.sibra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    private Integer DNI;

    @ManyToOne
    @JoinColumn(name = "code_administrador")
    private Administrador administrador;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String cargo;
    private String usuario;
    private String contrasena;

    public Usuario(){
    }

    public Usuario(int DNI, Administrador administrador, String nombre, String apellido, String correo, 
    int telefono, String cargo, String usuario, String contraseña){
        super();
        this.DNI=DNI;
        this.administrador=administrador;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.cargo=cargo;
        this.usuario=usuario;
        this.contrasena=contraseña;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer dNI) {
        DNI = dNI;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

}
