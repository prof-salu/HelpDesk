public class AtendenteHumano extends ManipuladorSuporte {
    @Override
    public void lidarCom(Ticket ticket) {
        if (ticket.getDificuldade().equals("AVANCADO")) {
            System.out.println("Atendente Humano resolveu o ticket: " + ticket.getTitulo());
        } else if (proximo != null) {
            proximo.lidarCom(ticket);
        }
    }
}