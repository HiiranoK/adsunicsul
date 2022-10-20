algoritmo Aula7Ex3
    inteiro n;
    real resultado=0;
    início
        escreva("Informe n");
        leia(n);
        se(n >0 && n%2==0){
            para(inteiro i=1;i<=n;i++){
                resultado+= 1/i;
            }
            escreva("O valor é:" + resultado);
        }
    fim