

public class Funcionario extends Cliente{

//------------------------------------------------------------------------------
    private int idFuncionario;
    private String nome;
    private int rgm;
    private String turma;

//------------------------------------------------------------------------------ CONSTRUTOR DEFAULT
    public Funcionario() {
    }

//------------------------------------------------------------------------------ CONSTRUTOR SOBRECARREGADO
    public Funcionario(String nome,String cpf,String endereco,String e_mail, String telefone,int idFuncionario, int rgm, String turma) {
        super(nome,cpf,endereco,e_mail,telefone);
        this.idFuncionario = idFuncionario;
        this.rgm = rgm;
        this.turma = turma;
    }

//------------------------------------------------------------------------------ GETTERS
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public int getRgm() {
        return rgm;
    }

    public String getTurma() {
        return turma;
    }

//------------------------------------------------------------------------------ SETTERS 
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

//------------------------------------------------------------------------------ IMPRIMIR
    @Override
    public String toString() {
        return "\nNome: "+nome+"\nCPF: "+super.getCpf()+"\nEndereço: "+super.getEndereco()+"\nE-mail: "+super.getE_mail()+"\nTelefone: "+super.getTelefone() +"\n ID Funcionario: " + idFuncionario + "\nRGM: " + rgm + "\nTurma: " + turma;
    }

//------------------------------------------------------------------------------ FIM!
}
