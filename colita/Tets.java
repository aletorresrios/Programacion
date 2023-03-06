package Tema8.colita;

public class Tets  {
    public static void main(String[] args) {
        int  t []= {3, 5, 7, 8, 9 ,10};
        Lista l = new Lista(t);
        l.encolar();
        l.mostrar();
        l.desencolar();
        
    }
}
