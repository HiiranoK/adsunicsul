public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }

    public double getBonificacao() {
        return super.getSalario()*0.5;
    }
}
