algoritmo Aula6Ex5
    inteiro destino;
    caractere retorno;
    início
        escreva("Informe o código do destino \n 1-Região Norte\n2-Região Nordeste\n3-Região Centro-Oeste\n4-Região Sul");
        leia(destino);
        escreva("Deseja adiantar a passagem de volta? use S ou N");
        leia(retorno);
        se(retorno == 'S' ou retorno == 's'){
            escolha(destino){
                caso 1:escreva("A passagem de ida + volta ficou por 900R$");
                pare
                caso 2:escreva("A passagem de ida + volta ficou por 650$");
                pare
                caso 3:escreva("A passagem de ida + volta ficou por 600$");
                pare
                caso 4:escreva("A passagem de ida + volta ficou por 550$");
                pare
                padrao:escreva("região inválida");
            }
        }senao se(retorno == 'N' ou retorno == 'n'){
            escolha(destino){
                caso 1:escreva("A passagem de ida ficou por 500$");
                pare
                caso 2:escreva("A passagem de ida ficou por 350$");
                pare
                caso 3:escreva("A passagem de ida ficou por 350$");
                pare
                caso 4:escreva("A passagem de ida ficou por 600$");
                pare
                padrao:escreva("região inválida");
            }
        }senao{
            escreva("Não consegui identificar se deseja ou não passagem de volta, por favor tente novamente.")
        }
    fim