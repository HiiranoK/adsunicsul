algoritmo Aula8Ex4;
    constante senha = "4531";
    literal tentativaSenha;
    início
        escreva("Informe a senha");
        leia(tentativaSenha);
        se(tentativaSenha == senha){
            escreva("Acesso liberado");
        }senao{
            escreva("Acesso negado");
        }
    fim