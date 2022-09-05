public class Administrador extends Funcionario implements IAutenticavel {

    private Autenticador autenticador;
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.8;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
