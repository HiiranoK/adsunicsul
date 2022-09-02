public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta = new ContaBancaria(111, 1111, 1110);
        conta.getTitular().setNome("Fulano");
        conta.resumoConta();
        

        
    }
}
