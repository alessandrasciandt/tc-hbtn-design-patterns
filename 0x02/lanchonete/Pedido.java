import java.util.HashSet;


public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item){
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
            String respota = "\tFora da Caixa:\n";
            for (ItemPedido item : itensForaCaixa) {
                respota = respota + "\t\t- " + item.getTipo() +  " " + item.getNome() + "\n";
            }
            respota = respota  + "\tDentro da Caixa:\n";

            for (ItemPedido item : itensDentroCaixa) {
                respota = respota + "\t\t- " + item.getTipo() +  " " + item.getNome() + "\n";
            }
            return respota;
        }
    }
