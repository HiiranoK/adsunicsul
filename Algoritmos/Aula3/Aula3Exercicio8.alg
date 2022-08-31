algoritmo Cofrinho
    inteiro moedasDeCinco, moedasDeDez, moedasDeVinteCinco, valorEmReais;
    início
        escreva("Informe a quantidades de moedas de 5 centavos: ");
        leia(moedasDeCinco);
        escreva("Informe a quantidade de moedas de 10 centavos: ");
        leia(moedasDeDez);
        escreva("Informe a quantidade de moedas de 25 centavos: ");
        leia(moedasDeVinteCinco);
        valorEmReais = ValorCofre(moedasDeVinteCinco,moedasDeDez,moedasDeCinco);
        escreva("Seu cofre possui" + valorEmReais + "R$");
    fim

    inteiro ValorCofre(inteiro vinteCinco, inteiro dez, inteiro cinco){inicio
        retorne((vinteCinco*25 + dez * 10 + cinco * 5)/100);
    }fim