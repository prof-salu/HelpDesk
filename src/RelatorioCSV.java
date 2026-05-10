public class RelatorioCSV {
    // ERRO: Os passos 1, 2 e 4 são exatamente iguais aos do PDF!
    public void gerarRelatorio() {
        System.out.println("1. Conectando ao Banco de Dados...");
        System.out.println("2. Extraindo dados dos tickets resolvidos...");

        // Passo exclusivo do CSV:
        System.out.println("3. Formatando dados separados por vírgula (CSV).");

        System.out.println("4. Fechando a conexão com o Banco.");
    }
}