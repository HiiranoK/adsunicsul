algoritmo Aula6Ex3
    real valor1, valor2
    caractere operador

    início
    escreva("Informe o 1º número!");
    leia(valor1);
    escreva("Informe o 2º número!");
    leia(valor2);
    escreva("Informe a operação matemática \n
    use um dos seguinte simbolos: + ou - ou * ou / ");
    leia(operador);
    escolha(operador){
        caso '+': escreva(valor1 + valor2);
        pare;
        caso '-': escreva(valor1 - valor2);
        pare;
        caso '*': escreva(valor1 * valor2);
        pare;
        caso '/': escreva( valor1 / valor2);
        pare;
        padrao: escreva("operador não reconhecido, tente novamente.")
    }
    fim