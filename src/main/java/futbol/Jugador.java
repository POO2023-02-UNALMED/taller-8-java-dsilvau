package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    @Override
    public int compareTo(Object o) {
        var otroJugador = (Jugador) o;
        return super.getEdad() - otroJugador.getEdad() ;
    }
}