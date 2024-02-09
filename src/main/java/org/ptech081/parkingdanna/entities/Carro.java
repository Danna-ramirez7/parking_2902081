package org.ptech081.parkingdanna.entities;


public class Carro {

   
    public String placa;
    public TipoVehiculo tipoVehiculo;

    

     public Carro() {
    }



    public Carro(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }
}
