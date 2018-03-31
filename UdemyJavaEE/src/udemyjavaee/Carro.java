/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyjavaee;

/**
 *
 * @author krixz
 */
public class Carro {

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double aDescuento) {
        descuento = aDescuento;
    }
    
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private double precio;
    private static double descuento;

    public Carro(String marca, String modelo, String color, String matricula, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
    }
    
    
    
    public void arrancarVehiculo() {
        
    }
    
    public void detenerVehiculo() {
        
    }
    
    void verPrecio() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
