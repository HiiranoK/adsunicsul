algoritmo Jurus
    real deposito, juros, rendimento
    início
        escreva ("informe o valor depositado");
        leia deposito;
        escreva ("informe a porcentagem da taxa de jurus");
        leia juros;
        rendimento = calculaJurus(deposito, juros)
        escreva("O rendimento é:" + rendimento);
        escreva("O valor total ficou" + deposito + rendimento);
    fim

    real calculaJurus(real deposito, real juros){inicio
        valorRendimento = deposito * (juros * 0.01);
        return valorRendimento
    }fim