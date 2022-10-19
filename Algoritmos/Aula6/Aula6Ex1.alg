algoritmo Aula6Ex1
    inteiro codigoCargo;
    real salario, aumento;
    início
        escreva("Informe o código do seu cargo:\n
        1-Escriturárie 2-Secretárie 3-caixa 4-Gerente 5-Diretore");
        leia(codigoCargo);
        escreva("Informe o seu salário atual");
        leia(salario);
        escolha(codigoCargo){
            caso 1: aumento = salario*0.5;
            escreva("O aumento para o seu cargo é de: " + aumento + "seu novo salário é: " + (salario + aumento));
            pare
            caso 2: aumento = salario*0.35;
            escreva("O aumento para o seu cargo é de: " + aumento + "seu novo salário é: " + (salario + aumento));
            pare
            caso 3: aumento = salario*0.2;
            escreva("O aumento para o seu cargo é de: " + aumento + "seu novo salário é: " + (salario + aumento));
            pare
            caso 4: aumento = salario*0.1;
            escreva("O aumento para o seu cargo é de: " + aumento + "seu novo salário é: " + (salario + aumento));
            pare
            caso 5:
            escreva("Diretores não receberão reajustes de salário, seu salário foi mantido em: " + salario);
            pare
            padrao: escreva("Valor inválido, tente novamente.")
        }       
    fim