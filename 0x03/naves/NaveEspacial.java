public class NaveEspacial {

    private int saude, ataque;

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return String.format("Saude: " + getSaude() + " - " + "Ataque: " + getAtaque());
    }
}
