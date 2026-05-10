public class RoboSuporte extends ManipuladorSuporte {
    @Override
    public void lidarCom(Ticket ticket) {
        if (ticket.getDificuldade().equals("BASICO")) {
            System.out.println("Robô da IA resolveu o ticket: " + ticket.getTitulo());
        } else if (proximo != null) {
            proximo.lidarCom(ticket);
        }
    }
}