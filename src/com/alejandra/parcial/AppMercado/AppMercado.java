package com.alejandra.parcial.AppMercado;

import com.alejandra.parcial.Domain.Mercado;
import com.alejandra.parcial.Domain.Producto;

import java.util.Arrays;

import static com.alejandra.parcial.Domain.TipoProducto.*;

public class AppMercado {
    public static void main(String[] args) {

        Mercado mercadoA = new Mercado("Mercado Alejandra");
        Producto colanta = new Producto(11,"Leche Colanta",1,2300,LACTEO);
        Producto pAbuela = new Producto(80,"Pan Abuela",1,5000,PAN);
        Producto solomo = new Producto(15,"Solomo Extrangero",1,9500,CARNE);
        Producto pera = new Producto(53,"Pera",1,1000,FRUTA);
        Producto brocoli= new Producto(44,"Brocoli",1,3500,VERDURA);
        Producto jabon = new Producto(32,"Jabon Corporal Palmolive",1,2800,ASEO);
        Producto detodito = new Producto(61,"DeTodito de Limon",1,2000,CONFITERIA);
        Producto ron = new Producto(42,"Ron de Caldas",1,53000,LICOR);

        mercadoA.getProductos().addAll(Arrays.asList(pAbuela,solomo,pera,brocoli,jabon,detodito));
        mercadoA.agregar(colanta);
        mercadoA.retirar(colanta.getNombre());
        mercadoA.buscar("Pera");
        mercadoA.buscar(42);
        mercadoA.buscarPorTipo("FRUTA");
        System.out.println("Lista Productos");
        mercadoA.getProductos().forEach(imprimir->{
            System.out.println(imprimir.getNombre()+ " "+ imprimir.getPrecio());
        });
        System.out.println("El total es:"+ mercadoA.calcularTotal());


    }
}
