package Tema7.hospital;

public class Traabajador {
    String nombre;
    int numIde;
    double sueldo;
    Traabajador(String nombre, int numIde, double sueldo) {
        this.nombre = nombre;
        this.numIde = numIde;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumIde() {
        return numIde;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumIde(int numIde) {
        this.numIde = numIde;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
