public class Impressao {

    private Integer paginasTotais;
    private Integer paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(Integer paginasTotais, Integer paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }
    public Impressao(){};

    public double calcularTotal(){
        double valorTotal;
        double pagPretoBranco = paginasTotais - paginasColoridas;

        if (ehFrenteVerso) {
            valorTotal = paginasColoridas * valorColoridasFrenteVerso + pagPretoBranco * valorPretoBrancoFrenteVerso;
        } else {
            valorTotal = paginasColoridas * valorColoridasFrenteApenas + pagPretoBranco * valorPretoBrancoFrenteApenas;
        }
        return valorTotal;
    }

    public String isFrenteVerson(boolean ehFrenteVerso) {
        if (ehFrenteVerso) {
            return "frente e verso.";
        } else {
            return "frente apenas.";
        }
    }

    @Override
    public String toString() {
        return "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + (paginasTotais - paginasColoridas) +
                ", " + isFrenteVerson(ehFrenteVerso) + String.format(" total: R$ %.2f", calcularTotal());
    }
}
