public abstract class ManipuladorSuporte {
    protected ManipuladorSuporte proximo;

    public void setProximo(ManipuladorSuporte proximo) {
        this.proximo = proximo;
    }

    public abstract void lidarCom(Ticket ticket);
}