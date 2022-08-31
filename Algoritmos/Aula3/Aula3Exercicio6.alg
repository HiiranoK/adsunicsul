algoritmo Desconto
    real valor;
    início
        escreva("informe o valor do produto");
        leia(valor);
        escreva("O valor do produto com os 9% de desconto é: " + desconto(valor));
    fim

    real Desconto(real preço){inicio
        preço = preço * 0.91;
        retorne preço;
    }fim