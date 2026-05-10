public class CaixaDeTickets {
    // Agora a estrutura interna é estritamente PRIVADA
    private Ticket[] meusTickets = new Ticket[10];
    private int tamanho = 0;

    public void adicionarTicket(Ticket ticket) {
        if (tamanho < 10) {
            meusTickets[tamanho] = ticket;
            tamanho++;
        }
    }

    // Fábrica de Iteradores
    public IteradorTickets criarIterador() {
        return new IteradorArray();
    }

    // Classe Interna: Sabe como navegar neste Array específico
    private class IteradorArray implements IteradorTickets {
        private int posicao = 0;

        @Override
        public boolean temProximo() {
            return posicao < tamanho;
        }

        @Override
        public Ticket obterProximo() {
            return meusTickets[posicao++];
        }
    }
}
