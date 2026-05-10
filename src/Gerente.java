public class Gerente extends ManipuladorSuporte {
    @Override
    public void lidarCom(Ticket ticket) {
        if (ticket.getDificuldade().equals("CRITICO")) {
            System.out.println("Gerente resolveu o ticket: " + ticket.getTitulo());
        } else {
            System.out.println("Ninguém sabe resolver este problema.");
        }
    }
}