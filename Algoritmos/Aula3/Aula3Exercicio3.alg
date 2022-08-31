algoritmo Jurus
    real valorCompra, quantidadeParcelas;
    início
        escreva("informe o valor da compra: ");
        leia(valorCompra);
        escreva("informe a quantidade de parcelas: ");
        leia(quantidadeParcelas);
        se(quantidadeParcelas > 1){
            escreva("O valor em cada parcela ficará: " + CalculaJurus(valorCompra,quantidadeParcelas));
        }senao{
            escreva("O valor a vista sairá: " + valorCompra)
        }
    fim

    real CalculaJurus(real valorCompra, real quantParcelas){inicio
        valorCompra = valorCompra * 1.05;
        retorne valorCompra / quantParcelas;
    }fim