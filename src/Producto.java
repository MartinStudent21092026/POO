public class Producto {
     private String nombre;
     private double precio;
     private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioConImpuesto(double impuesto){
        return this.precio*(100+impuesto)/100;
    }
    public double getPrecioTotalStock(){
        return this.precio*this.stock;
    }
    public void aumentarStock(){
        this.stock++;
    }
    public void disminuirStock(){
        this.stock--;
    }

    @Override
    public String toString() {
        return this.nombre+", "+this.precio+"€, total en almacén:"+this.stock;
    }
}
