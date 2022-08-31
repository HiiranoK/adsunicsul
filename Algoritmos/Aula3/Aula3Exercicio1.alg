algoritmo CalculoKmPorLitro
    real kmInicial, kmFinal, litrosGastos, precoLitro;
    real distancia, consumoMedio, valorGasto;
    início
        escreva("Informe o valor em kilometros ao inicio do percurso: ");
        leia(kmInicial);
        escreva("Informe o valor em kilometros ao final do percurso: ");
        leia(kmFinal);
        escreva("Informe quantos litros foram gastos nesse percurso: ");
        leia(litrosGastos);
        escreva("Informe o preço do combustivel usado:" );
        leia(precoLitro);
        distancia = CalculaDistanciaPercorrida(kmInicial,kmFinal);
        cal

    fim
    real CalculaDistanciaPercorrida(real inicio, real fim){inicio
        real distancia = fim - inicio;
        escreva("A distancia percorrida foi: " + distancia)
        retorne distancia;
    }fim
    void CalculaConsumoMedio(real distancia, real litrosGastos){inicio
        real consumo = distancia / litrosGastos
        escreva("O consumo medio do percurso foi: " + consumo + "km/litro" );
    }fim
    void CalculaValorGasto(real precoLitro, real litrosGastos){inicio
        real valor = precoLitro * litrosGastos;
        escreva("O curto total do percurso foi: " + valor + "R$");
    }fim
