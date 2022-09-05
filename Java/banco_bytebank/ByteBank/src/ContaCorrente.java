public class ContaCorrente extends ContaBancaria implements ITributavel{
    double taxaTransacao = 0.2;

    public ContaCorrente( int agencia, int numeroConta) {
        super( agencia, numeroConta);
    }
    
    @Override
    boolean sacar(double valor) {
        valor += taxaTransacao;
        return super.sacar(taxaTransacao);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
