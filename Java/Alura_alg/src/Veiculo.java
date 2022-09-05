public abstract class Veiculo {
    private String nome;
    private double preco;

    public Veiculo(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
