algoritmo exemplo5;
    real altura, peso, imc;
    início
        escreva("Informe a sua altura (em metros)");
        leia(altura);
        escreva("Informe o seu peso (em kg)");
        leia(peso)
        imc = altura /peso^2;
        se(imc < 20){
            escreva("você categoria é: abaixo do peso");
        }senao se( imc < 25){
            escreva("você categoria é: peso normal");
        }senao se(imc < 30){
            escreva("Você categoria é: sobrepeso");
        }senao se(imc < 40){
            escreva("Sua categoria é: obeso");
        }senao{
            escreva("Sua categoria é obeso morbido");
        }

    fim