

public class Veiculo {
    
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private int quilometragem;
    private double preco;
    private int idVeiculo;
    private static int indice = 101;
    
//------------------------------------------------------------------------------ CONSTRUTOR DEFAULT
    public Veiculo() { } 

//------------------------------------------------------------------------------ CONSTRUTOR SOBRECARREGADO
    public Veiculo(String modelo, String marca, String placa, int ano, int quilometragem, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.preco = preco;
        this.idVeiculo = indice;
        indice++;
    }
    
//------------------------------------------------------------------------------ GETTERS
    public String getModelo() {
    return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public double getPreco() {
        return preco;
    }
    
    public int getIdVeiculo() {
    return idVeiculo;
    }
//------------------------------------------------------------------------------ SETTERS  
    public void setModelo(String modelo) {
    this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
//------------------------------------------------------------------------------ IMPRIMIR
    @Override
    public String toString() {
        return "\nModelo: "+modelo+"\nMarca: "+marca+"\nPlaca: "+placa+"\nAno: "+ano+"\nQuilometragem: "+quilometragem+String.format("\nPreço: R$ %.2f",preco)+"\nID veículo: "+idVeiculo;
    }
    
//------------------------------------------------------------------------------ FIM! 
}
