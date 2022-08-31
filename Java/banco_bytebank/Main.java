package Java.banco_bytebank;

public class Main {
    public static void main(String[] args) {
       
       Cliente richard = new Cliente();
       richard.nome = "Richard";
       richard.cpf = "111.111.111.11";
       richard.profissao = "Programador";
       
       
        ContaBancaria teste = new ContaBancaria(richard, 1111, 101010, 100);
        // ContaBancaria outraConta = new ContaBancaria("Beutrano", 1111,131313, 100);
        teste.resumoConta();
        // teste.depositar(50);
        // teste.sacar(100);
        // teste.extrato();
        // teste.sacar(100);
        // teste.extrato();
        //teste.transfere(100, outraConta);
        //outraConta.extrato();
    }
}
