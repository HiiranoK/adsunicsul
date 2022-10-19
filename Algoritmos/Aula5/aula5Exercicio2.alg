algoritmo Aula5Ex2
    inteiro horas;
    caractere turno;
    início
        escreva("Informe seu turno com N para noite ou D para dia:");
        leia(turno);
        escreva("informe a quantidade de horas trabalhada");
        leia(horas);
        se(turno =='n' OU turno == 'N'){
            escreva("Seu pagamento é de " + (horas * 45));
        }
        senao{
            escreva("Seu pagamento é de" + (horas * 37.50));
        }
    fim