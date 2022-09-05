public class App {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente cC = new ContaCorrente(123, 2222);
        cC.depositar(100.0);

        ContaPoupanca cP = new ContaPoupanca(456, 3333);
        cP.depositar(200.0);
        
        cC.transfere(10.0, cP);
        System.out.println(cC.getSaldo());
        System.out.println(cP.getSaldo());

        var cI = new CalculadorImposto();

        cI.registrar(cC);
        System.out.println(cI.getTotalImposto());
    }
}
