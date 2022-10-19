algoritmo Aula5Ex3
    real auxilio;
    inteiro tempoEmMeses;
    início
        escreva("informe o valor do seu auxiolio");
        leia(auxilio);
        escreva("informe a duração de seu estágio em meses");
        leia(tempoEmMeses);
        se(auxilio >= 750 E auxilio <= 950 E tempoEmMeses >= 24){`
            escreva("Você participará do treinamento");
        }senao{
            escreva("Você não participará do treinamento");
        }
    fim