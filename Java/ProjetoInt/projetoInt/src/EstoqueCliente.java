
import java.util.ArrayList;

public class EstoqueCliente {
    private static ArrayList<Cliente> dadosClientes = new ArrayList<>();

//------------------------------------------------------------------------------------------------------ DADOS CLIENTES INICIAL
    
    
    public static void clientesInicial() {
        Cliente c10 = new Cliente("Marcelo Silva", "11111", "Rua Marcelo, 123", "marcelo@email.com", "11912");        //MUDAR DE INT PARA UM TIPO DE VARAIVEL QUE ACEITE NUMEROS MAIORES
        Cliente c11 = new Cliente("Gabriela Souza", "22222", "Rua Gabriela, 123", "gabriela@email.com", "1197");        //MUDAR DE INT PARA UM TIPO DE VARAIVEL QUE ACEITE NUMEROS MAIORES		
//        Cliente c12 = new Cliente("Antonio Medeiros", 33333333333, "Rua Antonio, 123", "antonio@email.com", 11913149770);			
//        Cliente c13 = new Cliente("Eduardo Dias", 44444444444, "Rua Eduardo, 123", "eduardo@email.com", 11983214655);			
//        Cliente c14 = new Cliente("Bianca Carvalho", 55555555555, "Rua Bianca, 123", "bianca@email.com", 11946678141);			
//        Cliente c15 = new Cliente("Maria Gomes", 66666666666, "Rua Maria, 123", "maria@email.com", 11936639180);			
//        Cliente c16 = new Cliente("Francisco Costa", 77777777777, "Rua Francisco, 123", "francisco@email.com", 11924904465);			
//        Cliente c17 = new Cliente("Paulo Garcia", 88888888888, "Rua Paulo, 123", "paulo@email.com", 11995175969);			
//        Cliente c18 = new Cliente("Larissa Lima", 99999999999, "Rua Larissa, 123", "larissa@email.com", 11929768763);			
//        Cliente c19 = new Cliente("Henrique Miranda", 10101010101, "Rua Henrique, 123", "henrique@email.com", 11970154714);			
//        Cliente c20 = new Cliente("Luiza Santos", 20202020202, "Rua Luiza, 123", "luiza@email.com", 11947650311);			

        
        dadosClientes.add(c10);
        dadosClientes.add(c11);
//        dadosClientes.add(c12);
//        dadosClientes.add(c13);
//        dadosClientes.add(c14);
//        dadosClientes.add(c15);
//        dadosClientes.add(c16);
//        dadosClientes.add(c17);
//        dadosClientes.add(c18);
//        dadosClientes.add(c19);
//        dadosClientes.add(c20);
    }
      
    
//------------------------------------------------------------------------------------------------------ GETTER 
    public static ArrayList<Cliente> getDadosClientes() {
        return dadosClientes;
    }

//------------------------------------------------------------------------------------------------------ ADICIONAR OBJETO CLIENTE NA ARRAYLIST
    static public void adicionar(Cliente c) {
        dadosClientes.add(c);
    }

//------------------------------------------------------------------------------------------------------ LISTAR TODOS OS CLIENTES
    static public String listarClientes() {
        String saida = "=========DADOS CLIENTES=========\n";
        for(Cliente c : dadosClientes) {
            saida += c.toString()+"\n\n";
            saida += "==================================\n";
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ PESQUISAR PELO CPF
    static public String pesquisarCPF(String cpf) {
        String saida = "========DADOS CLIENTE========\n";
        for(Cliente c : dadosClientes) {
            if(c.getCpf().equalsIgnoreCase(cpf)) {
                saida += c.toString()+"\n\n";
                saida += "==================================\n";
            }
//            else {                                               //  VERIFICAR SE ESTE else DA CERTO!!!
//                saida += "Não foi encontradao nenhum cadastro referente ao CPF: "+cpf+"\n\n";
//                saida += "==================================\n";
//            }
        }
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ PESQUISAR PELO CPF
    static public String venderCPF(String cpf) {
        String saida = "";
        for(Cliente c : dadosClientes) {
            if(c.getCpf().equalsIgnoreCase(cpf)) {
                saida += c.toString()+"\n";
            }
//            else {                                               //  VERIFICAR SE ESTE else DA CERTO!!!
//                saida += "Não foi encontradao nenhum cadastro referente ao CPF: "+cpf+"\n\n";
//                saida += "==================================\n";
//            }
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ FIM!
}
