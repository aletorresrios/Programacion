package Tema7.hospital;

public class Test {
    public static void main(String[] args) {
        Medico m1 = new Medico("Jesus", 12, 1200, 8, 33, AsignaMe.CARDIOLOGO);
        NoMedicos nm1 = new NoMedicos("Olga", 34, 1000, AsignaNoMe.RECEPCIONISTA);
        System.out.println(m1.numPac);
    }
    
}
