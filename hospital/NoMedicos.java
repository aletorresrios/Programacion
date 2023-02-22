package Tema7.hospital;

public class NoMedicos extends Traabajador {
    AsignaNoMe asigTra;

    public NoMedicos(String nombre, int numIde, double sueldo, AsignaNoMe asigTra) {
        super(nombre, numIde, sueldo);
        this.asigTra = asigTra;
    }

    public AsignaNoMe getAsigTra() {
        return asigTra;
    }

    public void setAsigTra(AsignaNoMe asigTra) {
        this.asigTra = asigTra;
    }
    
}
