package Java.aulaPOO; // area reservada para as bibliotecas necessárias no código.

public class Pessoa { // declaração da classe.
    
    // atributos privados ( só podem ser acessados dentro dessa classe.), seguido do tipo de dado e do rotulo.
    private String nome;
    private int idade;

    //declaração dos getters e setters, tanto para o nome quanto para a idade;



//  a 1ª palavra public é um modificador de acesso, ao usa-la você torna esse metodo acessível por qualquer parte do código.
//  já a 2ª palavra diz respeito ao tipo de retorno do método. metodos void não possuem retornos.
    public void setNome(String novoNome){ // set = definir | quando setamos algum dado, declaramos o tipo e o rotulo das variáveis desse escopo dentro dos parenteses.
        nome = novoNome;  // nome recebendo o novo nome.
    }

// 2ª palavra é String = retorna um dado de texto.
    public String getNome(){ // get = retornar
        return nome;
    }
 
    public void setIdade(int novaIdade){ // exatamente igual ao set anterior, só muda o tipo de dado.
        idade = novaIdade;
    }
//  2ª palavra é int = retorna um numero inteiro. 
    public int getIdade(){  
        return idade;

    }
}
