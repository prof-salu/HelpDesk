import java.util.Stack;

public class Historico {
    private Stack<Memento> estados = new Stack<>();

    public void empilhar(Memento m) {
        estados.push(m);
    }

    public Memento desempilhar() {
        if (!estados.isEmpty()) {
            return estados.pop();
        }
        return null;
    }
}