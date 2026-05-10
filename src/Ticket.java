public class Ticket {
    private String titulo;
    private String dificuldade; // Pode ser "BASICO", "AVANCADO" ou "CRITICO"

    public Ticket(String titulo, String dificuldade) {
        this.titulo = titulo;
        this.dificuldade = dificuldade;
    }

    public String getTitulo() { return titulo; }
    public String getDificuldade() { return dificuldade; }
}