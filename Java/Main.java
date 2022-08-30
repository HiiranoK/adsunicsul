package Java; // area reservada para as bibliotecas necessárias no código.

public class Main {

    public static void main(String[] args) {/*usando o exemplo que a professora deu, funciona como a "pagina principal de um site", 
                                            pra algum código ser devidamente executado é necessário que seja referenciado dentro desse bloco de código. */ 
        var alguem = new Pessoa(); 
        
        //alguem.nome = Pedro; // esse código está comentado pois não funcionará, já que o modificador de acesso dentro da classe pessoa tá como privado.
        // alguem.idade = 42;

        alguem.setIdade(15);

        System.out.println(alguem.getIdade());

        alguem.setNome("francisco");

        System.out.println(alguem.getNome());



        var caramero = new Cachorro();

        caramero.nome = "Bidu";
        caramero.raca = "Azul";

        caramero.setNome("Astolfo");
        System.out.println(caramero.getNome());
        caramero.setRaca("SRD"); // SRD = Sem raça definida.
        System.out.println(caramero.getRaca());
    }
}




















// package Java;

// /**
//  * testes
//  */
// public class testes {
// public static void main(String[] args) {
    
//     int idade = 17;
//     int quantidadePessoas =3;
//     boolean acompanhado = quantidadePessoas >=2;
//     if (idade >= 18 || acompanhado){
//         System.out.println("seja bem vindo!");
//     }else{
//         System.out.println("Você tem memos de 18 anos, você não pode entrar.");
//     }
// }
// }
// package Java;

/**
 * fulaninho quer calcular imposto, tá ae.
 */
// public class main {

//     public static void main(string[] args) {
//         double salario = 3300.0;

//         if(salario < 1900.0){
//             system.out.println("você não precisa pagar o imposto de renda");
//         }else if(salario <= 2800.0){
//             system.out.println("você deve reduzir " + salario*0.075 +"r$");
//         }else if(salario <= 3751.0){
//             system.out.println("você deve reduzir " + salario*0.15 +"r$");
//         }else{
//             system.out.println("você deve reduzir" + salario*0.225+ "r$");
//         }
//     }
// }