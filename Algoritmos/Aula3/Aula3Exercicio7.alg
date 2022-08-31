algoritmo 
    inteiro totalTalheiroVendido, totalQuadradoVendido; valorTotal
    início
        escreva("Informe o total de talheiros vendidos");
        leia(totalTalheiroVendido);
        escreva("Informe o total de quadrados vendidos");
        leia(totalQuadradoVendido);
        valorTotal = CalculaTotalDoDia(totalTalheiroVendido,totalQuadradoVendido);
        comissao(valorTotal);
    fim

    real CalculaTotalDoDia(inteiro talheiro, inteiro quadrado){inicio
        real totalTalheiro = talheiro * 1.05;
        real totalQuadrado = quadrado * 0.51; 
        real total = totalQuadrado + totalTalheiro;
        escreva("O valor total arrecado hoje é: " + total)
        retorne total;
    }fim
    
    void Comissao(real total){
        escreva("O valor reservado para comissão é: " + total * 0.1)
    }