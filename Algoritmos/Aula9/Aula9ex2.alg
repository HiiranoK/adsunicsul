algoritmo Aula9Ex2
    inteiro valores[10],divisor;
    início
        para(inteiro i=0;i < valores.tamanho;i++){
            escreva("Informe o valor na "+(i+1)"º posição.");
            leia(valores[i]);
        }
        divisor = valores[0]
        para(inteiro j=0;j<valores.tamanho;j++){
            se(valores[j] > divisor){
                divisor = valores[j];
            }
        }
        para(inteiro k=0;k<valores.tamanho;k++){
            valores[k] = valores[k] / divisor;
            escreva(valores[k]);
        }
    fim