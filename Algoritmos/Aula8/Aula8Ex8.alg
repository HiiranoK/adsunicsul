algoritmo Aula8Ex8
    inteiro anoNascimento, anoAtual,idade,idadeParcial;
    início
        escreva("Informe seu ano de nascimento");
        leia(anoNascimento);
        escreva("Informe o ano atual");
        leia(anoAtual);
        idade = anoAtual- anoNascimento
        escreva("Sua idade é: " + (idade));
        idadeParcial = 2050 - anoAtual; 
        escreva("Sua idade em 2050 será:" + (idade+idadeParcial));
    fim