public class Main {
    public static void main(String[] args) {
        System.out.println("=== HELP DESK CORPORATIVO (REFATORADO) ===\n");

        System.out.println("--- 1. Chain of Responsibility ---");
        // Montando a cadeia de responsabilidade
        ManipuladorSuporte robo = new RoboSuporte();
        ManipuladorSuporte atendente = new AtendenteHumano();
        ManipuladorSuporte gerente = new Gerente();

        robo.setProximo(atendente);
        atendente.setProximo(gerente);

        // O cliente só envia para a "porta de entrada" (o robô)
        robo.lidarCom(new Ticket("Dúvida de Login", "BASICO"));
        robo.lidarCom(new Ticket("Servidor Caiu", "CRITICO"));
        System.out.println();

        System.out.println("--- 2. Template Method ---");
        GeradorRelatorioBase pdf = new RelatorioPDF();
        pdf.gerarRelatorio(); // Executa o esqueleto padronizado + passo em PDF
        System.out.println();

        System.out.println("--- 3. Memento ---");
        EditorResposta editor = new EditorResposta();
        Historico historico = new Historico();

        editor.escrever("Caro cliente, ");
        historico.empilhar(editor.guardar()); // Snapshot 1

        editor.escrever("o seu problema foi resolvido. ");
        historico.empilhar(editor.guardar()); // Snapshot 2

        System.out.println("Texto Atual: " + editor.getTexto());

        // Simular um erro do utilizador
        editor.escrever("jkdsjfksdfjksdjfksd (Oops, gato andou no teclado)");
        System.out.println("Texto Estragado: " + editor.getTexto());

        // Ctrl+Z em ação!
        editor.restaurar(historico.desempilhar()); // Desfaz o último (restaura pro 2)
        System.out.println("Texto Restaurado: " + editor.getTexto());
        System.out.println();

        System.out.println("--- 4. Iterator ---");
        CaixaDeTickets caixa = new CaixaDeTickets();
        caixa.adicionarTicket(new Ticket("Faturação", "BASICO"));
        caixa.adicionarTicket(new Ticket("Erro no App", "AVANCADO"));

        // O cliente usa o Iterador sem saber que a caixa usa um Array por trás
        IteradorTickets iterador = caixa.criarIterador();
        while (iterador.temProximo()) {
            System.out.println("A ler ticket: " + iterador.obterProximo().getTitulo());
        }
    }
}