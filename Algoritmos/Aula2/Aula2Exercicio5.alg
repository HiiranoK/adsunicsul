algoritmo Bhaskara
    real a,b,c, deltaBruto, deltaSoma, deltaSubtracao;
    início
        escreva("Informe o valor de a");
        leia ("a");
        escreva("Informe o valor de b");
        leia ("b");
        escreva("Informe o valor de c");
        leia ("c");
        
        deltaBruto = b*b - 4*a*c;
        deltaSoma = (-b + raiz(deltaBruto)) / 2*a
        deltaSubtracao = (-b - raiz(deltaBruto)) / 2*a
        escreva("delta 1: " + deltaSoma);
        escreva("delta 2: " + deltaSubtracao);
        escreva("O valor médio é igual a: " (deltaSoma+deltaSubtracao)/2)

    fim