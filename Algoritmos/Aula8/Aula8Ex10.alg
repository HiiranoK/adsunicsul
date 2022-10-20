algoritmo Aula8Ex10
    real valorA, valorB;
    inteiro menu;
    início
    escreva("Menu de opcoes\n
    1- Somar dois Números\n
    2- Subtrair dois números\n
    3- Multiplicar dois números\n
    4- Sair");
    leia(menu);
    escreva("Informe o 1º valor");
    leia(valorA);
    escreva("Informe o 2º valor");
    leia(valorB);
    escolha(menu){
        caso 1: escreva(valorA + valorB);
        pare
        caso 2: escreva(valorA - valorB);
        pare
        caso 3: escreva(valorA * valorB);
        pare
        padrao:
        escreva("saindo....");
    }
    fim