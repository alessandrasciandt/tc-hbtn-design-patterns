public class Ladrao extends Personagem{
    public Ladrao(String nome, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) throws Exception {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
        if(destreza < forca || destreza < inteligencia){
            throw new Exception("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (forca * 0.5) + (destreza * 0.35) + (vigor * 0.1) + (inteligencia * 0.05);
    }
}
