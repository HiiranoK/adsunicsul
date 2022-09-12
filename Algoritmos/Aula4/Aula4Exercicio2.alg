algoritmo Exercicio2;
    real salarioMinimo,quilowattsTotal, quilowattsUnitario;
    início
        escreva("Informe o valor do salario mínimo");
        leia(salarioMinimo);
        escreva("Informe a quantidade de quilowatts gasta");
        leia(quilowatts);
        quilowattsUnitario = valorPorKillowatt(salarioMinimo,quilowatts,7)
        escreva("O valor por quiloWatts é: " + quilowattsUnitario);
        escreva("O valor total é:" +  quilowattsUnitario * quilowattsTotal);
        escreva("O valor com 10% de desconto é: " + quilowattsUnitario * quilowattsTotal *0.9);
    fim

    real valorPorKillowatt(real Salario, real quilowatts, real divisao){inicio
        real valor100Quilowatts = salario/divisao;
        return valor100Quilowatts/100;
    }fim