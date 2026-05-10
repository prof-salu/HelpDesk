public class Memento {
    private final String estadoGuardado;

    public Memento(String estadoGuardado) {
        this.estadoGuardado = estadoGuardado;
    }

    public String getEstadoGuardado() {
        return estadoGuardado;
    }
}