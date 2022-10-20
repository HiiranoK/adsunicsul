algoritmo Aula8Ex9
    real salario, totalVendas,comissao;
    início
    escreva("Informe o seu salário");
    leia(salario);
    escreva("Informe o valor total de suas vendas");
    leia(totalVendas);
    comissao = totalVendas*0.04;
    escreva("O total de comissão é: " + comissao + " O salario final é: " + (salario+comissao))
    fim