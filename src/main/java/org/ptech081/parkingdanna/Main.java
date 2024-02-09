package org.ptech081.parkingdanna;

import org.ptech081.parkingdanna.entities.*;


public class Main {
    public static void main(String[] args) {
        //crear carro con los constructores
        Carro carrito1 = new Carro("ASB 456", TipoVehiculo.Moto);
        Carro carrito2 = new Carro();
        carrito2.placa = "ERRT 324";
        carrito2.tipoVehiculo = TipoVehiculo.Camioneta;

        //crear clientes 
        Cliente cliente1 = new Cliente("cristian","buitrago",123456789);
        //invocar el metodo addCar:
        cliente1.addCar(carrito1);
        cliente1.addCar("ASB 456", TipoVehiculo.Bus);
        //recorrer los carros del cliuente
        for(Carro c : cliente1.misCarros){
            System.out.println(c.placa + " " + c.tipoVehiculo);
            System.out.println("-----------");
        }
    }
}