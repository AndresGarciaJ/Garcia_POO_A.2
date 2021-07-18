
package ec.edu.intsuperior.modelo;

public class Celular {
    
    private String marca;
    private double precio;
    private String color ;
    
    public Celular() {
    }

    public Celular(String marca, double precio, String color) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
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
}
