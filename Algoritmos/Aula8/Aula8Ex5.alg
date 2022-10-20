algoritmo Aula8Ex5
    inteiro totalAlunos = 500, idade,mediaIdadesNaoEleitores=0, totalNaoEleitores, totalEleitores; 
    início
        para(inteiro i=1;i<=500;i++){
            escreva("Informe a idade do "+i+"º aluno");
            leia(idade);
            se(idade>=16){
                totalEleitores++;
            }senao{
                totalNaoEleitores++;
                mediaIdadesNaoEleitores+=idade;
            }
        }
        escreva("O total de eleitores é: "+ totalEleitores);
        escreva("A média da idade dos alunos não eleitores é: " mediaIdadesNaoEleitores);
        
    fim