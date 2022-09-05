public class Gerente extends Funcionario  implements IAutenticavel {

    private Autenticador autenticador;

    public Gerente(String nome, String cpf, double salario){
        super(nome,cpf,salario);
        autenticador = new Autenticador();
    }
    
    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
        
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }


}
