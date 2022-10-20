algoritmo Aula7Ex6
    inteiro totalPositivo=0, totalNegativo=0, totalDeZeros=0;
    real valor, menorValor=0;
    caractere = 
    início
        enquanto(verdadeiro){
            escreva("Informe um valor");
            leia(valor);
            se(valor < 0){
                totalNegativo++;
                se(valor< menorValor){
                    menorValor = valor;
                }
            }senao se(valor > 0){
                totalPositivo++;
            }
            senao{
                totalDeZeros++;
            }
            escreva("Deseja encerrar o laço? se sim, digite S");
            leia(caractere);
            se(condicao == 'S' ou condicao == 's'){
                pare;
            }
        }
        escreva("O menor valor é: "+ menorValor);
        escreva("O total de valores negativos é: "+totalNegativo);
        escreva("O total de valores positivo é: "+ totalPositivo);
        escreva("O total de valores neutros é: "+ totalDeZeros);
    fim