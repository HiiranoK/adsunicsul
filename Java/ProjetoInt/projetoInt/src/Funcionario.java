

public class Funcionario {

//------------------------------------------------------------------------------
    private int idFuncionario;
    private String nome;
    private int rgm;
    private String turma;

//------------------------------------------------------------------------------ CONSTRUTOR DEFAULT
    public Funcionario() {
    }

//------------------------------------------------------------------------------ CONSTRUTOR SOBRECARREGADO
    public Funcionario(int idFuncionario, String nome, int rgm, String turma) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
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
        return "\nID Funcionario: " + idFuncionario + "\nNome: " + nome + "\nRGM: " + rgm + "\nTurma: " + turma;
    }

//------------------------------------------------------------------------------ FIM!
}
