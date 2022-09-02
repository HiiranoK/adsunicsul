public class App {
    public static void main(String[] args) throws Exception {
        Funcionario richard = new Funcionario();

        richard.setNome("Richard");
        richard.setCpf("111.222.333-45");
        richard.setSalario(2500.00);

        System.out.println(richard.getNome() + "\n" + richard.getCpf() + "\n" + richard.getSalario() + "\n" + richard.getBonificacao());
    }
}
