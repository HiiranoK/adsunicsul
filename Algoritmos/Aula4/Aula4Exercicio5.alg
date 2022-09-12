algoritmo exercicio5
    real salario,aumento;
    início
        escreva("informe o seu salario");
        leia salario;
        escreva("informe o percentual de aumento");
        leia aumento;
    fim
    void calculaAumento(real salario, real aumento){inicio
        real aum = salario * aumento * 0.01;
        escreva("O valor do aumento é:" + aum);
        escreva("Seu novo salario é" + salario + aum);
    }fim