algoritmo IMC
    real peso,altura;
    início
        escreva("Informe o seu peso");
        leia(peso);
        escreva("Informe a sua altura");
        leia(altura);
        CalculaIMC(peso,altura);
    fim

    void CalculaIMC(real peso, real altura){inicio
        escreva("Seu IMC é: " + peso/(altura*altura))
    }fim