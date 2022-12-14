import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> lista = super.obterIngredientes();
        lista.add("leite");
        return lista;
    }

    @Override
    public double obterPreco() {
       double precoBebidacomLeite = super.obterPreco() + 3.2;
       return precoBebidacomLeite;
    }
}
