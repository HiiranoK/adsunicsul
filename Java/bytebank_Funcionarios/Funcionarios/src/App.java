public class App {
    public static void main(String[] args){

        Gerente bella = new Gerente("Bellinha","111.222.333-44",8000.00);
        bella.setSenha(1234);

        Administrador richard = new Administrador("Richard", "111.222.333.55", 4000.00);
        richard.setSenha(1234);

        System.out.println(bella.getNome() + "\n" +  bella.getCpf() + "\n" +  bella.getSalario() + "\n" +  bella.getBonificacao());
        SistemaInterno si = new SistemaInterno();

        si.autentica(bella);
        si.autentica(richard);
        
    }
}
