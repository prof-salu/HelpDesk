public class CaixaDeTickets {
    // ERRO: O Array interno está exposto ao mundo (public).
    // Qualquer mudança aqui quebrará todo o sistema que usa este array.
    public Ticket[] meusTickets = new Ticket[10];
    public int tamanho = 0;

    public void adicionarTicket(Ticket ticket) {
        if (tamanho < 10) {
            meusTickets[tamanho] = ticket;
            tamanho++;
        }
    }
}