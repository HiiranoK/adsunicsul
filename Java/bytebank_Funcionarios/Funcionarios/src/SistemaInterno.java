public class SistemaInterno {
    
    private int senha = 1234;

    public void autentica(IAutenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Login Aprovado.");
        }else{
            System.out.println("Senha Inválida.");
        }
    }
}
