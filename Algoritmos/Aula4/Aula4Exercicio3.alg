algoritmo name
    inteiro data;
    início
        escreva("Escreva uma data com 6 digitos DDMMAA");
        leia(data);
        inteiro dia = data / 10000;
        inteiro mes = data % 10000 / 100;
        inteiro ano = data % 100;
        escreva("dia" + dia + "mes" + mes + "ano" + ano);
    fim