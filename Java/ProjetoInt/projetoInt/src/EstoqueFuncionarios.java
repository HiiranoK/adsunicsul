
import java.util.ArrayList;
        
public class EstoqueFuncionarios {
    private static ArrayList<Funcionario> dadosFuncionarios = new ArrayList<>();

//------------------------------------------------------------------------------------------------------ DADOS FUNCIONARIOS INICIAL

    
    public static void funcionariosInicial() {
        Funcionario f1 = new Funcionario("Nicolas Ricciardi da Rocha","333.333.333.-33","bla","nicolas@email.com","119XXXX-XXXX",  "30151953", "Turma D");
        Funcionario f2 = new Funcionario("Rafael Trindade Guarnieri", "222.222.222-22","abc","rafael@email.com","119XXXX-XXXX", "29976243", "Turma D");

        dadosFuncionarios.add(f1);
        dadosFuncionarios.add(f2);
    }
    
    
//    Funcionario a1 = new Funcionario(01, "Nicolas Ricciardi da Rocha", 301519653, "Turma D");
//    Funcionario f2 = new Funcionario(2, "Rafael Trindade Guarnieri", 29976243, "Turma D");
//    dadosFuncionarios.add(a1);
//    dadosFuncionarios.add(f2);

    
//------------------------------------------------------------------------------------------------------ GETTER
    public static ArrayList<Funcionario> getDadosFuncionarios() {
        return dadosFuncionarios;
    }
    
//------------------------------------------------------------------------------------------------------ ADICIONAR OBJETO FUNCIONARIO NA ARRAYLIST
    static public void adicionar(Funcionario f) {
        dadosFuncionarios.add(f);
    }
    
//------------------------------------------------------------------------------------------------------ LISTAR TODOS OS FUNCIONARIOS
    static public String listarFuncionarios() {
        String saida = "========FUNCIONÁRIOS CONCESSIONÁRIA========\n";
        for(Funcionario f : dadosFuncionarios) {
            saida += f.toString()+"\n\n";
            saida += "==================================\n";
        }
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ PESQUISAR PELO ID
    static public String pesquisarID(int idFuncionario) {
        String saida = "";
        for(Funcionario f : dadosFuncionarios) {
            if(f.getIdFuncionario()==idFuncionario) {
                saida += f.toString()+"\n";
            }
        }
        return saida;
    } 

    static public boolean removerFuncionario(int idFuncionario) {
        Funcionario f = dadosFuncionarios.get(idFuncionario); 
        dadosFuncionarios.remove(f);
        return true;
    }

    
//------------------------------------------------------------------------------------------------------ FIM!
}
