algoritmo HoraParaMinutos
    inteiro horas, minutosHora, minutosTotais;
    início
        escreva("informe a hora atual");
        leia(horas);
        escreva("informe o minuto atual");
        leia(minutosHora);
        minutosTotais = horas*60 + minutosHora;
        escreva("já se passaram " + minutosTotais + ( "minutos hoje!"));
    fim