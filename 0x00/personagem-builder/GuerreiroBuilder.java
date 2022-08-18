public class GuerreiroBuilder implements Builder{

    private String nome;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public Guerreiro build(){
        try{
            return new Guerreiro(nome, inteligencia, forca, vigor, resistencia, destreza);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
