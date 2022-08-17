public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        if (TipoPersonagem.MAGO == tipo) {
            try {
                return new Mago(nome, 10,2,5,3,4);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (TipoPersonagem.GUERREIRO == tipo) {
            try {
                return new Guerreiro(nome, 1,8,5,10,6);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (TipoPersonagem.LADRAO == tipo){
            try{
                return new Ladrao(nome, 2,6,8,5,10);
        }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
