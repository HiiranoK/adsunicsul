

public class Funcionario extends Cliente{

//------------------------------------------------------------------------------
    private String turma, rgm; 
    private int idFuncionario ;
    private static int contador =1;

//------------------------------------------------------------------------------ CONSTRUTOR DEFAULT
    public Funcionario() {
    }

//------------------------------------------------------------------------------ CONSTRUTOR SOBRECARREGADO
    public Funcionario(String nome,String cpf,String endereco,String e_mail, String telefone, String rgm, String turma) {
        super(nome,cpf,endereco,e_mail,telefone);
        this.idFuncionario = contador;
        this.rgm = rgm;
        this.turma = turma;
        contador++;
    }

//------------------------------------------------------------------------------ GETTERS
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getRgm() {
        return rgm;
    }

    public String getTurma() {
        return turma;
    }

//------------------------------------------------------------------------------ SETTERS 

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

//------------------------------------------------------------------------------ IMPRIMIR
    @Override
    public String toString() {
        return "\nNome: "+super.getNome()+"\nCPF: "+super.getCpf()+"\nEndereço: "+super.getEndereco()+"\nE-mail: "+super.getE_mail()+"\nTelefone: "+super.getTelefone() +"\n ID Funcionario: " + idFuncionario + "\nRGM: " + rgm + "\nTurma: " + turma;
    }

//------------------------------------------------------------------------------ FIM!
}
