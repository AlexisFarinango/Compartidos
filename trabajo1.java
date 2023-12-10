public class Deportes {
//Nivel 1 :clase Base
    String nombre;

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
//Nivel 2 :Clases derivadas de Deporte 
class DeportesIndividuales extendes Deportes {
    int NumeroJugadores;
    public DeportesIndividuales(String nombre,int NumeroJugadores){
        super(nombre);
        this.numeroJugadores=numeroJugadores;
    }
    public int getNumeroJugadores(){
        return NumeroJugadores;
    }
}
class DeportesColectivos extends Deportes{
int numeroJugadoresColectivos(String nombre ,numeroJugadoresColectivos){
    super(nombre);
    this.numeroJugadoresColectivos=numeroJugadoresColectivos;
}
public int getnumeroJugadoresColectivos(){
    return numeroJugadoresColectivos;
} 
}
    
    











    

    
    public static void main(String[] args){
        /*Dilan*/





        /*Alex*/






    
        /*Alexis*/
    
        System.out.println("Hola mundo");
        System.out.println("asioi mundo");
        System.out.println("ok");
        System.out.println("okasd");
        System.out.println("Dilan");

    }
}
