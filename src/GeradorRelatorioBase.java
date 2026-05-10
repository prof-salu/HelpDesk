public abstract class GeradorRelatorioBase {

    // O Template Method: o esqueleto do algoritmo é fixo (final)
    public final void gerarRelatorio() {
        System.out.println("1. Conectando ao Banco de Dados...");
        System.out.println("2. Extraindo dados dos tickets resolvidos...");

        formatarDados(); // Passo variável

        System.out.println("4. Fechando a conexão com o Banco.");
    }

    // Método que as filhas são obrigadas a implementar
    protected abstract void formatarDados();
}