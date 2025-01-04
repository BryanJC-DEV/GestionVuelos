/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bryan
 */
public class Cliente {
    //falta poner metodos.
    private String Cedula;
   private String Nombres;
   private String Apellidos;
   private String Telefono;
   private String Correo;
   private String Direccion;
   private String Nacimiento;
   private String Contraseña;

   public Cliente() {
   }

   public Cliente(String Cedula, String Nombres, String Apellidos, String Telefono, String Correo, String Direccion, String Nacimiento, String Contraseña) {
      this.Cedula = Cedula;
      this.Nombres = Nombres;
      this.Apellidos = Apellidos;
      this.Telefono = Telefono;
      this.Correo = Correo;
      this.Direccion = Direccion;
      this.Nacimiento = Nacimiento;
      this.Contraseña = Contraseña;
   }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
   
}
