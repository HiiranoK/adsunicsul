public class Fornecedor implements IAutenticavel {

    private Autenticador autenticar;
    Fornecedor(){
        autenticar = new Autenticador();
    }

    @Override
    public void setSenha(int senha) {
        autenticar.setSenha(senha);
        
    }

    @Override
    public boolean autentica(int senha) {
       return autenticar.autentica(senha);
    }
    

}
