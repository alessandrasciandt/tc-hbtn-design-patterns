public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantPaginasColoridas, boolean ehFrenteVerso) {
        if (tamanhoImpressao == TamanhoImpressao.A2) {
            Impressao impressao = new Impressao(totalPaginas, quantPaginasColoridas, ehFrenteVerso, 0.28,
                    0.18, 0.32, 0.22);
            return impressao;
        } else if (tamanhoImpressao == TamanhoImpressao.A3) {
            Impressao impressao = new Impressao(totalPaginas, quantPaginasColoridas, ehFrenteVerso, 0.25,
                    0.15, 0.30, 0.20);
            return impressao;
        } else {
            Impressao impressao = new Impressao(totalPaginas, quantPaginasColoridas, ehFrenteVerso, 0.20,
                    0.10, 0.25, 0.15);
            return impressao;
        }
    }
}
