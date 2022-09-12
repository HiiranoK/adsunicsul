algoritmo calcSalarios
    real salarioRecebido, salarioMinimo;
    início
        escreva("Informe o salario que você recebe");
        leia(salarioRecebido);
        escreva("Informe o valor do salario minimo");
        leia(salarioMinimo);
    fim

    void calculaSalario(real salario, real minimo){
        real calc = salario / minimo;
        escreva ("você recebe " + calc + " salarios minimos");
    }