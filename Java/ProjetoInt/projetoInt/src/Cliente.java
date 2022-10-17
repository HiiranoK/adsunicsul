
public class Cliente {

//------------------------------------------------------------------------------ 
    private String nome;
    private String cpf;           //MUDAR DE INT PARA UM TIPO DE VARAIVEL QUE ACEITE NUMEROS MAIORES
    private String endereco;
    private String e_mail;
    private String telefone;           //MUDAR DE INT PARA UM TIPO DE VARAIVEL QUE ACEITE NUMEROS MAIORES
    
//------------------------------------------------------------------------------ CONSTRUTOR DEFAULT
    public Cliente() {};
    
//------------------------------------------------------------------------------ CONSTRUTOR SOBRECARREGADO
    public Cliente(String nome, String cpf, String endereco, String e_mail, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.e_mail = e_mail;
        this.telefone = telefone;
    }
    
//------------------------------------------------------------------------------ GETTERS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getTelefone() {
        return telefone;
    }
    
//------------------------------------------------------------------------------ SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
//------------------------------------------------------------------------------ IMPRIMIR
    @Override
    public String toString() {
        return "\nNome: "+nome+"\nCPF: "+cpf+"\nEndereço: "+endereco+"\nE-mail: "+e_mail+"\nTelefone: "+telefone;
    }
    
//------------------------------------------------------------------------------ FIM!

}
