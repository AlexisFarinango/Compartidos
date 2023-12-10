public class Deportes {
//Nivel 1 :clase Base
    public String nombre;

    public Deportes(String nombre) {
        this.nombre = nombre;
    }


}
//Nivel 2 :Clases derivadas de Deporte 
class DeportesIndividuales extends Deportes {
    int NumeroJugadores;
    public DeportesIndividuales(String nombre,int NumeroJugadores){
        super(nombre);
        this.NumeroJugadores=NumeroJugadores;
    }

}
class DeportesColectivos extends Deportes{
    int numeroJugadoresColectivos;
        DeportesColectivos(String nombre ,int numeroJugadoresColectivos){
        super(nombre);
        this.numeroJugadoresColectivos=numeroJugadoresColectivos;
    }
}

// Nivel 3
class Futbol extends DeportesColectivos {
    public int goles;
    public Futbol(String nombre, int numeroJugadores, int goles) {
        super(nombre, numeroJugadores);
        this.goles=goles;
    }
}

class Tenis extends DeportesIndividuales {
    public int puntos;
    public Tenis(String nombre, int numeroJugadores, int puntos) {
        super(nombre, numeroJugadores);
        this.puntos=puntos;
    }
}

// Nivel 4
class FutbolSala extends Futbol {
    public int vocalia;
    public FutbolSala(String nombre, int numeroJugadores, int goles, int vocalia ) {
        super(nombre, numeroJugadores, goles);
        this.vocalia=vocalia;
    }
}

class PingPong extends Tenis {
    public String raqueta;
    public PingPong(String nombre, int numeroJugadores, int puntos, String raqueta) {
        super(nombre, numeroJugadores, puntos);
        this.raqueta=raqueta;
    }
};


    
    



    
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
