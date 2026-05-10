public class RelatorioPDF {
    public void gerarRelatorio() {
        System.out.println("1. Conectando ao Banco de Dados...");
        System.out.println("2. Extraindo dados dos tickets...");
        System.out.println("3. Formatando dados num design visual (PDF)."); // Única diferença
        System.out.println("4. Fechando a conexão.");
    }
}
// RelatorioCSV tem os exatos mesmos passos 1, 2 e 4. Apenas o passo 3 muda!