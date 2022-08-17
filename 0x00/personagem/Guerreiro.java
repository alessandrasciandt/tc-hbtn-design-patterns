public class Guerreiro extends Personagem{
    public Guerreiro(String nome, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) throws Exception {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);
        if(forca < inteligencia || forca < destreza){
            throw new Exception("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (forca * 0.8) + (vigor * 0.05) + (destreza * 0.1) + (inteligencia * 0.05);
    }
}
