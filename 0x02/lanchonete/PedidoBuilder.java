public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();

    public PedidoBuilder() {};

    public Pedido build(){
        return pedido;
    }

    @Override
    void setLanche(TipoLanche tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.LANCHE, tipo.name()));
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        ItemPedido item = new ItemPedido(TipoItemPedido.BATATA, tamanho.name());
        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BRINDE, tipo.name()));
    }

    @Override
    void setBebida(TipoBebida tipo) {
        pedido.adicionarItemForaCaixa(new ItemPedido(TipoItemPedido.BEBIDA, tipo.name()));
    }
}
