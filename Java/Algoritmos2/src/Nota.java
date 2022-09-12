public class Nota {
    private String aluno;
    private double valor;


    public Nota(String nome, double nota){
        this.aluno = nome;
        this.valor = nota;
    }

    public String getAluno() {
        return aluno;
    }
    public double getValor() {
        return valor;
    }
}
