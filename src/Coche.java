public class Coche {
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private boolean automatico;
    private double motor;

    //Construtor para objecto con parametros ingresados
    //Tambien se puede generar con atajo
    public Coche(String marca, String modelo, int anyoFabricacion, boolean automatico, double motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.automatico = automatico;
        this.motor = motor;
    }

    //Construtor para objeto con solo 1 parametro
    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "POO";
    }

    //Constructor para objetos vacios
    public Coche() {
        this.marca = "CEI";
        this.modelo = "IPE";
        this.anyoFabricacion = 2026;
        this.automatico = false;
        this.motor = 3.45;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    //Tambien se puede generar con atajo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    //Este metodo reemplazaa toString, tambien se puede generar por atajo
    public String toString(){
        return "loquesea";
    }
}
