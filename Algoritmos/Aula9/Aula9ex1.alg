algoritmo Aula9Ex1
    inteiro vendaDia{11,13,15,11,...,25,44,31,7,35}, total=0, media, maoir, menor, acimaMedia=0;
    início
        menor = vendaDia[0];
        maior = vendaDia[0];
        para(inteiro i=0;i<vendaDia.tamanho;i++){
            total+= vendaDia[i];
            se(vendaDia[i] > maior){
                maior = vendaDia[i];
            }
            se(vendaDia[i] < menor){
                menor = vendaDia[i];
            }
        }
        media = total/vendaDia.tamanho;

        para(inteiro j=0;j<vendaDia.tamanho; j++){
            se(vendaDia[i] > media){
                acimaMedia++;
            }
        }
        escreva("A maior venda foi de: " + maior + " produtos");
        escreva("A menor venda foi de: " + menor + " produtos");
        escreva("A media de venda foi: "+ media + " produtos por dia")
        escreva("O total de dias acima da média foi: "+ acimaMedia);

    fim