algoritmo Aula7Ex9
    inteiro idade, salarioBaixo=0, totalIdades=0,totalPessoas=0,totalHomens;
    caractere genero;
    real salario, totalSalarioMasculino;
   início
        enquanto(idade >=0){
            escreva("Informe a sua idade");
            leia(idade);
            escreva("Informe seu sexo, use F para feminino e M para masculino");
            leia(genero);
            escreva("Informe seu salario");
            leia(salario);
            totalIdades+=idade;
            totalPessoas++;
            se(genero== 'F' e salario < 600 ou genero == 'f'e salario < 600 ){
                salarioBaixo++;
            }
            se(genero== 'M' ou genero == 'm'){
                totalSalarioMasculino+= salario;
                totalHomens++;
            }senao{
                escreva("valor para o sexo não reconhecido, portanto desconsiderado");
            }
            escreva("Deseja encerrar o laço? se sim, digite S");
            leia(caractere);
            se(condicao == 'S' ou condicao == 's'){
                pare;
            }
        }
        escreva("O total de mulheres com salario inferior a 600 é:"+ (salarioBaixo));
        escreva("A média do salario dos Homens é :"+ (totalSalarioMasculino/totalHomens));
        escreva("A média da idade do grupo é:"+(totalIdades/totalPessoas))
    fim