algoritmo AreaDeBaseDoCilindro
    real raio, altura, areaBase, volume; 
    real PI = 3.14;
    início
        escreva("Informe o valor do raio do cilindro (em cm)");
        leia(raio);
        escreva("por favor informe a altura do cilindro (em cm)");
        leia(altura);
        areaBase = PI * r*r;
        volume = altura*areaBase;
        escreva("a área da base é: " + areaBase + "o volume máximo é: " + volume "cm³");
    fim