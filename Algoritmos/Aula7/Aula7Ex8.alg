algoritmo Aula7Ex8
    real nota, totalTurma=0;
    inteiro Aprovados=0, quantidadeNotas=80, notaInvalida=0;
    início
        para(inteiro i=1;i<=quantidadeNotas;i++){
            escreva("Informe a"+i+"ª nota: ");
            leia(nota);
            se(nota >=0 e nota<=10){
                totalTurma +=nota;
                se(nota >= 6){
                    Aprovados++;
                }
            }senao{
                notaInvalida++;
            }
            escreva("A média das notas válida é: "+ (totalTurma/(quantidadeNotas-notaInvalida)));
            escreva("O total de notas inválidas digitadas foi" + notaInvalida);
            escreva("O total de aprovados é: " + aprovados);
        }
    fim