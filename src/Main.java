public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        System.out.println("puertas =" + miCoche.Puertas);

    }
}
class coche{
    int Puertas = 0;
    void agregarPuerta (){
        this.Puertas++;
    }

}
//PRUEBA CLASS