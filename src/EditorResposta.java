public class EditorResposta {
    private String texto = "";

    public void escrever(String novasPalavras) {
        this.texto += novasPalavras;
    }

    public String getTexto() {
        return texto;
    }

    // Cria a fotografia
    public Memento guardar() {
        return new Memento(texto);
    }

    // Restaura a fotografia
    public void restaurar(Memento memento) {
        this.texto = memento.getEstadoGuardado();
    }
}