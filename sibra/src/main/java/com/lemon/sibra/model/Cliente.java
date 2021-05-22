package com.lemon.sibra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int DNI;
    private String nombre;
    private String apellido;
    private int telefono;
    
    public Cliente(){
    }

    public Cliente(int DNI, String nombre, String apellido, int telefono){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
