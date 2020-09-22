package com.alejandra.parcial.Domain;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static byte CAPACIDAD = 10;
    private String supermercado;
    private List<Producto> productos;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos=new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public boolean agregar(Producto p)
    {
        boolean agrega=false;
        if(productos.size()<=CAPACIDAD)
        {   for(int i = 0; i<productos.size();i++)
            {
                if(productos.get(i).getCodigo()==p.getCodigo())
                {
                    agrega=false;
                }
                else
                {
                    productos.add(p);
                    agrega=true;
                }
            }
        }
        else
        {
             agrega=false;
        }
        if(agrega==true)
        {
            System.out.println("Se agrego a canasta el producto");
        }
        else
        {
            System.out.println("producto ya existe no se puede agregar");
        }
        return agrega;
    }
    public boolean retirar(String nombre)
    {
        boolean retiro=false;
        for(int i = 0; i< productos.size();i++) {
            if (productos.get(i).getNombre() == nombre) {
                productos.remove(i);
                retiro=true;
            } else {
                retiro= false;
            }
        }
        if(retiro==true)
        {
            System.out.println("Se elimino producto");
        }
        else
        {
            System.out.println("producto no se encuentra en lista");
        }
        return retiro;
    }
    public Producto buscar (String nombre)
    {
        Producto producto=null;
        for(int i=0;i<productos.size();i++)
        {
            if(productos.get(i).getNombre()== nombre)
            {
                producto= productos.get(i);
            }
            else
            {
                producto=null;
            }

        }
        System.out.println("la lista de producto con el nombre es  : "+producto );
        return producto;
    }
    public Producto buscar (int codigo)
    {
        Producto producto=null;
        for(int i=0;i<productos.size();i++)
        {
            if(productos.get(i).getCodigo()==codigo)
            {
                producto =productos.get(i);
            }
            else
            {
                producto= null;
            }
        }
        System.out.println("la lista de producto con el codigo es : "+ producto);
        return producto;
    }
    public ArrayList<Producto> buscarPorTipo (String tipo)
    {
        ArrayList<Producto> productoTipo=null;
        for(int i=0;i<productos.size();i++)
        {
            if(productos.get(i).getTipo()==tipo)
            {
                productoTipo.add(productos.get(i));
            }
        }
        if(productoTipo!=null)
        {
            System.out.println("la lista de productos con el mismo tipo");
            productoTipo.forEach(lista->{
                System.out.println(lista);
            });
        }

        return productoTipo;
    }
    public int calcularTotal()
    {
        int total=0;
        for(int i=0;i<productos.size();i++)
        {
            total= total + (productos.get(i).getCantidad() * productos.get(i).getPrecio());

        }
        return total;

    }

}
