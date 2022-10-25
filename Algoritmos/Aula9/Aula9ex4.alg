algoritmo Aula9Ex4
    inteiro i=0, alunosAds=0, acimaMedia=0, media;
    real notas[100], notasTotal=0;
    literal nomes[100], curso[100];
    início
        enquanto[notas != -1]{
            escreva("Informe a nota do aluno, ou -1 para encerrar");
            leia(notas[i]);
            escreva("Informe o nome do aluno");
            leia(nomes[i]);
            escreva("Informe o curso do aluno (CCP ou TADS)");
            leia(curso[i]);
            i++;
        }
        para(inteiro j=0; j< curso.tamanho;j++){
            se(curso[j] == "tads" ou curso[j]== "TADS"){
                alunosAds++;
            }
            notasTotal += notas[j]
        }
        media = notasTotal/notas.tamanho;
        para(inteiro k=0; k < notas.tamanho){
            se(notas[k] > media){
                acimaMedia++;
            }
        }
        escreva("O total de alunos do curso de ADS é: "+ alunosAds);
        escreva("A média dos alunos é: "+ media);
        escreva("O total de alunos acima da média é: "+ acimaMedia);
    fim