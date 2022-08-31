algoritmo Minutos
    inteiro horas,minutos
    início
        escreva("Informe o valor em horas")
        leia(horas) // 13
        escreva("informe o valor em minutos")
        leia(minutos) // 15
        escreva("O tempo informado em minutos é igual a:" + ConverteTempoEmMinutos(horas,minutos)) // 795
    fim

    inteiro ConverteTempoEmMinutos( inteiro hora, inteiro minuto){inicio
        hora = hora * 60 // 780
        return hora + minuto // 780 + 15 = 795
    }fim