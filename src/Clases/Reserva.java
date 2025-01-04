/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bryan
 */
public class Reserva {
   //falta metodos.
   private int Id;
   private int CodigoVuelo;
   private Asiento asiento;
   private String CedulaCliente;
   private boolean Estado;

   public Reserva() {
      this.asiento = new Asiento();
   }

   public Reserva(int CodigoVuelo, String CedulaCliente) {
      this.CodigoVuelo = CodigoVuelo;
      this.asiento = new Asiento();
      this.CedulaCliente = CedulaCliente;
      this.Estado = true;
   }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(int CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
   
}
