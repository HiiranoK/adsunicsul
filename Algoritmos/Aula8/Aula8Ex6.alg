algoritmo Aula8Ex7
    inteiro totalSim=0, totalMulheres=0, mulheresNao=0;
    caractere sexo,interesse;
    início
        para(inteiro i=1;i<=200;i++){
            escreva("Informe seu sexo com F para feminino e M para masculino");
            leia(sexo);
            escreva("Tem interesse no produto? responda com S para Sim e N para não");
            leia(interesse);
            se(sexo == 'f' ou sexo == 'F'){
                totalMulheres++;
                se(interesse=='n'ou interesse=='N'){
                    mulheresNao++;
                }
            }
            se(interesse=='s'ou interesse=='S'){
                totalSim++;
            }
        }
        escreva("A quantidade total de sim foi:"+ totalSim);
        escreva("A porcentagem de mulheres que respondeu não é: " +((totalMulheres*mulheresNao)/100)+"%");
    fim