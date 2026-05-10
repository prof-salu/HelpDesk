public class Main {
    public static void main(String[] args) {
        System.out.println("=== HELP DESK CORPORATIVO (CÓDIGO LEGADO) ===\n");

        System.out.println("--- 1. Problema de Roteamento ---");
        RoteadorDeTickets roteador = new RoteadorDeTickets();
        roteador.processar(new Ticket("Esqueci a senha", "BASICO"));
        roteador.processar(new Ticket("Servidor Caiu", "CRITICO"));
        System.out.println();

        System.out.println("--- 2. Problema de Relatórios (Duplicação) ---");
        RelatorioPDF pdf = new RelatorioPDF();
        pdf.gerarRelatorio();
        System.out.println();

        System.out.println("--- 3. Problema do Editor (Sem Undo) ---");
        EditorResposta editor = new EditorResposta();
        editor.escrever("Prezado cliente, ");
        editor.escrever("seu problema foi resolvido.");
        System.out.println("Texto Atual: " + editor.getTexto());
        System.out.println("Ops, apaguei tudo sem querer! (Impossível recuperar o texto antigo)");
        System.out.println();

        System.out.println("--- 4. Problema da Caixa de Entrada (Encapsulamento Quebrado) ---");
        CaixaDeTickets caixa = new CaixaDeTickets();
        caixa.adicionarTicket(new Ticket("Dúvida Faturamento", "BASICO"));
        caixa.adicionarTicket(new Ticket("Erro no App", "AVANCADO"));

        // O cliente (Main) é forçado a saber que a Caixa usa um Array internamente:
        for (int i = 0; i < caixa.tamanho; i++) {
            System.out.println("Lendo ticket: " + caixa.meusTickets[i].getTitulo());
        }
    }
}