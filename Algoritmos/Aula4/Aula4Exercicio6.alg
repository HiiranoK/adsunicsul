algoritmo Exercicio6
    real raio;
    início
        escreva("Informe o raio");
        leia(raio);
        escreva("A area do circulo é: " + areaCirculo(raio)); 
    fim

    real areaCirculo(real raio){inicio
        real PI = 3.14;
        area = pi * raio^2;
        return area; 
    }fim