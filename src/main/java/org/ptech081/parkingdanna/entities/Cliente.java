package org.ptech081.parkingdanna.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String apellidos;
    public long identificacion;
    public List<Carro> misCarros;
    public Cliente() {
        this.misCarros = new ArrayList<Carro>();

    }
    public Cliente(String nombre, String apellidos, long identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.misCarros = new ArrayList<Carro>();

    }
//pri,era sobre carga
    public void addCar(Carro car) {
        this.misCarros.add(car);

    }

    //segunda sobre carga de addCar
    public void addCar (String placa, TipoVehiculo tv){
    Carro car = new Carro(placa , tv);
    this.misCarros.add(car);
    }

        
    }



