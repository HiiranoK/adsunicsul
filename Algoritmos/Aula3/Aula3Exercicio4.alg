algoritmo Bhaskara
    real a,b,c, deltaBruto,
    início
        escreva("Informe o valor de a");
        leia ("a");
        escreva("Informe o valor de b");
        leia ("b");
        escreva("Informe o valor de c");
        leia ("c");
        deltaBruto = EncontraDelta(a,b,c)
        getX1(a,b,c)
        getX2(a,b,c)
    
    fim

    real getDelta(real a, real b, real c){inicio
        retorne(b^2-4*a*c)
    }fim

    void getX1(real a, real b, real c){inicio
        escreva("X1 = " (-b + raiz(deltaBruto)) / (2*a))
    }fim
    void getX2(real a, real b, real c){inicio
        escreva("X2 = " (-b - raiz(deltaBruto)) / (2*a))
    }fim