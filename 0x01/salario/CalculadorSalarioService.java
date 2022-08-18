import java.util.UUID;

public class CalculadorSalarioService {

    static CalculadorSalarioService instancia;
    public UUID uuid = UUID.randomUUID();


    private CalculadorSalarioService(){};

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if(instancia == null){
            instancia = new CalculadorSalarioService();
        }
        return instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        double salarioToT;
        return salarioToT = salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }
}
