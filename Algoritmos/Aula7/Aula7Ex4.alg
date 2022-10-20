algoritmo Aula7Ex4
    inteiro quantidade;
    real valores, total;
    início
        escreva("Informe a quantidade de valores");
        leia(quantidade);
        para(inteiro i=0;i<=quantidade;i++){
            escreva("informe o "+ (i+1)+"º valor");
            leia(valores);
            total+=valores;
        }
        escreva("A médoas dos valores é: "+ total/quantidade);
    fim