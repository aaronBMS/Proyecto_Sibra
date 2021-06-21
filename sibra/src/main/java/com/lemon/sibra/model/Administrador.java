package com.lemon.sibra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "administrador")
public class Administrador {
    
    @Id
    private int dni;
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String cargo;
    private String usuario;
    private String contrasena;

    public Administrador(){
    }

    public Administrador(int dni, String codigo, String nombre, String apellido, String correo, 
    int telefono, String cargo, String usuario, String contraseña){
        this.dni=dni;
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.cargo=cargo;
        this.usuario=usuario;
        this.contrasena=contraseña;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dNI) {
        dni = dNI;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
