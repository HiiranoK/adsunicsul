

public class ContaBancaria {

    private Cliente titular = new Cliente();
    private int numeroConta;
    private int agencia;
    private double saldo;
    private static int totalDeContas;

    public ContaBancaria(int agencia, int numeroConta, double saldo){
        if(agencia <= 0){
            this.agencia = agencia;
        }else{
            System.out.println("Valor para agencia inválido, valor padrão aplicado");
            this.agencia = 0001;
        }
        if(numeroConta <= 0){
            this.numeroConta = numeroConta;
        }else{
            System.out.println("Valor para numero da conta inválido, valor padrão aplicado");
            this.numeroConta = -1;
        }
        if(saldo <= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Valor para agencia inválido, valor padrão aplicado");
            // 0 já é o padrão.
        }
        ContaBancaria.totalDeContas++;
    }
    public ContaBancaria(Cliente titular, int agencia, int numeroConta, double saldo){
        this(agencia,numeroConta,saldo);
        this.titular = titular;
    }


    void depositar(double valor){
        if(valor >=0){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }
    }
    
    boolean sacar(double valor){
        if(valor < 0 && valor <= this.saldo){
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
    public Cliente getTitular() {
        return titular;
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
    public static int getTotalDeContas() {
        return ContaBancaria.totalDeContas;
    }

}
