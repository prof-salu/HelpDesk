public class EditorResposta {
    private String texto = "";

    public void escrever(String novasPalavras) { this.texto += novasPalavras; }
    public String getTexto() { return texto; }
    // ERRO: Se escrevermos algo errado, não há forma nativa de anular a última inserção.
}