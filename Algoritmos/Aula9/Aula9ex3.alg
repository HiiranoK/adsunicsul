algoritmo Aula9Ex3
    real vetor[1000],total=0,media,acimaMedia=0;
    logico validacao = verdadeiro;
    inteiro contador=0, sair;

    início
        enquanto(validacao){
            escreva("informe o numero na " contador+1"ª posicao da lista");
            leia(vetor[contador]);
            total+=vetor[contador];
            contador++;
            escreva("Deseja encerrar o laço? se sim responda com -1");
            leia(sair);
            se(sair == -1){
                validacao = falso;
            }
        }
        media = total / vetor.tamanho;
        escreva("A média entre os valores informados é: " + media);
        para(inteiro i=0; i<vetor.tamanho;i++){
            se(vetor[i] > media){
                acimaMedia++;
            }
        }
        escreva("A quantidade de valores acima da média é: "+acimaMedia);
    fim