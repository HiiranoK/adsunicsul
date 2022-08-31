package Java.banco_bytebank;

public class ContaBancaria {

    private Cliente titular;
    private int numeroConta;
    private int agencia;
    private double saldo;

    public ContaBancaria(Cliente declaraTitular, int declaraAgencia, int declaraNumero, double iniciaSaldo){
        this.titular = declaraTitular;
        this.numeroConta = declaraNumero;
        this.saldo = iniciaSaldo;
        this.agencia = declaraAgencia;
    }
    void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }
    
    boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        } else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    void transfere(double valor, ContaBancaria destino){
        if(sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
        }else{
            System.out.println("Transferência cancelada");
        }
        
    }

    void extrato(){
        System.out.println("O seu saldo é: " + getSaldo());
    }

    void resumoConta(){
        System.out.println("Bem vindo ao Bytebank " + titular.nome + " essas são as informações de sua conta: \n" +
        "numero: " + numeroConta + ", agencia: " + agencia + ", o saldo atual é: " + saldo);
    }
    String getNome() {
        return this.titular.nome;
    }
    int getConta() {
        return this.numeroConta;
    }

    int getAgencia() {
        return this.agencia;
    }
    double getSaldo() {
        return this.saldo;
    }
    void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
