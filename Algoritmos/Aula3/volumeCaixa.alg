algoritmo VolumeCaixa
    inteiro altura, comprimento, profundidade
    início
        escreva("informe o valor da altura (em cm)")
        leia(altura)
        escreva("informe o valor da largura (em cm)")
        leia(comprimento)
        escreva("informe o valor do comprimento")
        leia(profundidade)
        escreva("O volume em metros é igual a: " + CalculaVolumeParalelepipedo(altura,comprimento,profundidade))
    fim
    inteiro CalculaVolumeParalelepipedo(inteiro altura, inteiro comprimento, inteiro profundidade){inicio
        inteiro volume = (altura*comprimento*profundidade)/100
        return volume
    }fim