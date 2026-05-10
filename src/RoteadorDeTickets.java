public class RoteadorDeTickets {
    public void processar(Ticket ticket) {
        // ERRO: Alto acoplamento com todos os níveis e regras hard-coded
        if (ticket.getDificuldade().equals("BASICO")) {
            System.out.println("Robô da IA resolveu o ticket: " + ticket.getTitulo());
        } else if (ticket.getDificuldade().equals("AVANCADO")) {
            System.out.println("Atendedor Humano resolveu o ticket: " + ticket.getTitulo());
        } else if (ticket.getDificuldade().equals("CRITICO")) {
            System.out.println("Gerente resolveu o ticket: " + ticket.getTitulo());
        } else {
            System.out.println("Ninguém sabe resolver este problema.");
        }
    }
}