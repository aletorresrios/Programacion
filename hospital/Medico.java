package Tema7.hospital;

public class Medico extends Traabajador{
    int numCol;
    int numPac;
    AsignaMe profesion;
    Medico(String nombre, int numIde, double sueldo, int numCol, int numPac, AsignaMe profesion) {
        super(nombre, numIde, sueldo);
        this.numCol = numCol;
        this.numPac = numPac;
        this.profesion = profesion;
    }
    public int getNumCol() {
        return numCol;
    }
    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }
    public int getNumPac() {
        return numPac;
    }
    public void setNumPac(int numPac) {
        this.numPac = numPac;
    }
    public AsignaMe getProfesion() {
        return profesion;
    }
    public void setProfesion(AsignaMe profesion) {
        this.profesion = profesion;
    }

    
    
    
}
