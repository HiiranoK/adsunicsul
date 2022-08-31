algoritmo CotacaoDollar
    real totalBRL, cotacao, totalUSD;
    início 
        escreva("Informe quantos reais deseja converter: ");
        leia(totalBRL);
        escreva("Informe a cotação atual do dollar");
        leia(cotacao);
        totalUSD = converteDolar(totalBRL,cotacao);
        escreva("Seguindo essa cotação o valor será de : " + totalUSD + "USD");
    fim

    real converteDolar(real totalBRL,real cotacao){inicio
        retorne totalBRL / cotacao;
    }fim