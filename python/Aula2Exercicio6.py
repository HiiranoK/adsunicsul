comprimento_a= float(input("informe a metragem da rua do Sol "))
comprimento_b = float(input("informe a metragem da estrada dos pássaros verdes "))
quadrado_hipotenusa = comprimento_a * comprimento_a + comprimento_b * comprimento_b
i= 1
while(quadrado_hipotenusa > 0):
    quadrado_hipotenusa = quadrado_hipotenusa - i
    i = i+2
    print(quadrado_hipotenusa)