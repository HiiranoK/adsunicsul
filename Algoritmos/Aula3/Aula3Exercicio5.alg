algoritmo CalcVelocidade
    real distanciaObj1,distanciaObj2,distanciaObj3,tempoObj1,tempoObj2,tempoObj3; 
    início
        escreva("Informe a distancia (em metros) percorrida pelo 1º objeto");
        leia(distanciaObj1);
        escreva("Informe o tempo (em segundos) que ele levou para percorrer esse percurso");
        leia(tempoObj1);

        escreva("Informe a distancia (em metros) percorrida pelo 2º objeto");
        leia(distanciaObj2);
        escreva("Informe o tempo (em segundos) que ele levou para percorrer esse percurso");
        leia(tempoObj2);
        
        escreva("Informe a distancia (em metros) percorrida pelo 3º objeto");
        leia(distanciaObj3);
        escreva("Informe o tempo (em segundos) que ele levou para percorrer esse percurso");
        leia(tempoObj3);

        escreva("O 1º objeto se moveu a uma velocidade de: " + CalculaVelocidade(distanciaObj1,tempoObj1) + "m/s")
        escreva("O 2º objeto se moveu a uma velocidade de: " + CalculaVelocidade(distanciaObj2,tempoObj2) + "m/s")
        escreva("O 3º objeto se moveu a uma velocidade de: " + CalculaVelocidade(distanciaObj3,tempoObj3) + "m/s")
    fim

    inteiro CalculaVelocidade(real distancia, real tempo){inicio
        velocidade = distancia / tempo;
        retorne velocidade;
    }fim