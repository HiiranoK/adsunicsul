algoritmo Aula7Ex7
    caractere condicao, genero;
    inteiro totalMulheres=0, totalHomens=0;
    real altura, alturaMulheres=0, alturaHomens=0;
   início
        enquanto(verdadeiro){
            escreva("Informe seu sexo, use F para feminino e M para masculino");
            leia(genero);
            escreva("Informe sua altura");
            leia(altura);
            se(genero== 'F' ou genero == 'f'){
                alturaMulheres+=altura;
                totalMulheres+=1;
            }
            senao se(genero== 'M' ou genero == 'm'){
                alturaHomens+=altura;
                totalHomens+=1;
            }senao{
                escreva("Valor para o sexo não reconhecido, portanto desconsiderado");
            }
            escreva("Deseja encerrar o laço? se sim, digite S");
            leia(caractere);
            se(condicao == 'S' ou condicao == 's'){
                pare;
            }
        }
        escreva("A média da altura das mulheres é:"+ (alturaMulheres/totalMulheres));
        escreva("A média da altura dos homens é:"+ (alturaHomens/totalHomens));
    fim