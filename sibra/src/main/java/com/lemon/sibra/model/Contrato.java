package com.lemon.sibra.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contrato")
public class Contrato {
    
    @Id
    private String ID;

    @ManyToOne
    @JoinColumn(name = "code_administrador")
    private Administrador administrador;
    private String description;

    @ManyToOne
    @JoinColumn(name = "dni_cliente")
    private Cliente cliente;
    private Time horaInicio;
    private Time horaFin;
    private double total;

    public Contrato(){
    }

    public Contrato(String ID, Administrador administrador, String description, Cliente cliente, Time horaInicio, 
    Time horaFin, double total){
        super();
        this.ID=ID;
        this.administrador=administrador;
        this.description=description;
        this.cliente=cliente;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.total=total;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
