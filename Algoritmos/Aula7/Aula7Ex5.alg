algoritmo Aula7Ex5
    caractere condicao;
    inteiro quantidade = 0;
    real valor,maiorValor=0 totalValores=0;
    início
        enquanto(verdadeiro){
            escreva("Informe um valor");
            leia(valor);
            se(maiorValor < valor){
                maiorValor= valor;
            }
            totalValores+=valor;
            quantidade+=1;
            escreva("Deseja encerrar o laço? se sim, digite S");
            leia(caractere);
            se(condicao == 'S' ou condicao == 's'){
                pare;
            }
        }
        escreva("O maior valor é: "+ maiorValor);
        escreva("A média dos valores é: "+ (totalValores/quantidade));
    fim