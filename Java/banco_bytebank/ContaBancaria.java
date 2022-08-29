package Java.banco_bytebank;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private int agencia;
    private int saldo;

    public ContaBancaria(String declaraTitular, int declaraAgencia, int declaraNumero, int iniciaSaldo){
        titular = declaraTitular;
        numeroConta = declaraNumero;
        saldo = iniciaSaldo;
        agencia = declaraAgencia;
    }
    
    public void resumoConta(){
        System.out.println("Bem vindo ao Bytebank" + titular + " essas são as informações de sua conta: \n" +
        "numero: " + numeroConta + ", agencia: " + agencia + ", o saldo atual é: " + saldo);
    }
    public String getNome() {
        return titular;
    }
    public int getConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
