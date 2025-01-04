/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bryan
 */
public class Asiento {
   //Falta hacer un metodo.
    private int Id;
   private int Numero;
   private int CodigoVuelo;
   private String Tipo;
   private float Precio;
   private boolean Disponibilidad;

    public Asiento() {
    }

    public Asiento(int Id, int Numero, int CodigoVuelo, String Tipo, float Precio, boolean Disponibilidad) {
        this.Id = Id;
        this.Numero = Numero;
        this.CodigoVuelo = CodigoVuelo;
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Disponibilidad = Disponibilidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(int CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
   
}
