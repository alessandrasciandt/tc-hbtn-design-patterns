public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        if (TipoPersonagem.MAGO == tipo) {
            try {
                return new Mago(nome, 8,3,3,3,4);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (TipoPersonagem.GUERREIRO == tipo) {
            try {
                return new Guerreiro(nome, 0,9,7,10,7);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (TipoPersonagem.LADRAO == tipo){
            try{
                return new Ladrao(nome, 1,8,7,7,10);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
