algoritmo Aula8Ex1
    inteiro idade, totalMeses,totalDias;
    início
        escreva("Informe a sua idade em anos");
        leia(idade);
        se(idade>0){
            escreva("Idade inválida");
        }senao{
            totalmeses = idade*12;
            totaldias= totalMeses*30;
            escreva("Você já viveu" + totaldias+ " dias na sua vida");
        }
    fim