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
//Nivel 5
class Datosspartido extends FutbolSala {
    public int numeropartido;
    public String equipojugador;
    public Datospartido(String nombre, int numeroJugadores, int goles, int vocalia, int numeropartido, String equipojugador ){
        super(nombre,numeroJugadores, goles, vocalia);
        this.numeropartido = numeropartido;
        this.equipojugador = equipojugador;
    }
class Cancha extends PingPong {
    public String tipo;
    public Cancha(String nombre, int numeroJugadores, int puntos, String raqueta, String tipo){
        super(nombre, numeroJugadores, puntos, raqueta);
        this.tipo = tipo;
    }
    
}
    
}

}
