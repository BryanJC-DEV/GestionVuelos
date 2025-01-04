/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bryan
 */
public class Vuelo {
    //falta metodos
    private String Aerolinea;
   private String Origen;
   private String Destino;
   private String FechaSalida;
   private String FechaLlegada;
   private String HoraSalida;
   private String HoraLlegada;
   private int Codigo;
   private int CantidadAsientos;
   private int AsientosDisponibles;
   private int Maletas;
   private int Peso;

   public Vuelo() {
   }

   public Vuelo(int Codigo, String Aerolinea, String Origen, String Destino, String FechaSalida, String FechaLlegada, String HoraSalida, String HoraLlegada, int CantidadAsientos, int Maletas, int Peso) {
      this.Codigo = Codigo;
      this.Aerolinea = Aerolinea;
      this.Origen = Origen;
      this.Destino = Destino;
      this.FechaSalida = FechaSalida;
      this.FechaLlegada = FechaLlegada;
      this.HoraSalida = HoraSalida;
      this.HoraLlegada = HoraLlegada;
      this.CantidadAsientos = CantidadAsientos;
      this.AsientosDisponibles = CantidadAsientos;
      this.Maletas = Maletas;
      this.Peso = Peso;
   }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaLlegada() {
        return FechaLlegada;
    }

    public void setFechaLlegada(String FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidadAsientos() {
        return CantidadAsientos;
    }

    public void setCantidadAsientos(int CantidadAsientos) {
        this.CantidadAsientos = CantidadAsientos;
    }

    public int getAsientosDisponibles() {
        return AsientosDisponibles;
    }

    public void setAsientosDisponibles(int AsientosDisponibles) {
        this.AsientosDisponibles = AsientosDisponibles;
    }

    public int getMaletas() {
        return Maletas;
    }

    public void setMaletas(int Maletas) {
        this.Maletas = Maletas;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
   
}
