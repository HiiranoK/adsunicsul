algoritmo Aula8Ex11
    real salario;
    literal nome;
    início
        para(i=0; i>10;i++)
        escreva("Informe seu nome");
        leia(nome);
        escreva("Informe seu salario");
        leia(salario);
        se(salario >= 1500){
            salario*=1.1;
            escreva(nome+ " seu novo salario é: "+ salario);
        }senao se(salario >3000){
            salario*=1.02;
            escreva(nome+ " seu novo salario é: "+ salario);
        }senao{
            escreva(nome+ " você não tem direito a reajuste de salario");
        }
    fim