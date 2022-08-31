algoritmo AreaRetangulo
    inteiro altura, base;
    início
        escreva("informe a altura do retangulo (em cm): ");
        leia(altura);
        escreva("informe o tamanho da base do retangulo (em cm)");
        leia(base);
        escreva("O valor da area do retangulo é: " + calculaArea(altura,base));
    fim
    
    inteiro calculaArea(inteiro a, inteiro b){inicio
        area = a*b;
        retorne area;
    }fim