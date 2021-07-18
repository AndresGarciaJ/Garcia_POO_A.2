
package ec.edu.intsuperior.modelo;

public class Impresora {
    
    String marca;
    double precio;
    double tamanio;
    String color;
    
    public Impresora() {
    }
    public Impresora(String marca, double precio, String color, double tamanio) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double gettamanio() {
        return tamanio;
    }
    
   public void settamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    }
    
