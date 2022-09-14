def main():

    km_inicial = float(input("Informe o valor em kilometros ao inicio do percurso: "))
    km_final = float(input("Informe o valor em kilometros ao final do percurso: "))
    litros_gastos = float(input("Informe quantos litros foram gastos nesse percurso: "))
    preco_litro = float(input("Informe o preço por litro do combustível usado: "))
    distancia = calcula_distancia(km_inicial,km_final)
    calcula_consumo_medio(distancia,litros_gastos)
    calcula_valor_gasto(preco_litro,litros_gastos)

def calcula_distancia(inicio,fim):
    distancia = fim - inicio
    print("A distancia percorrida foi: ", distancia)
    return distancia

def calcula_consumo_medio(distancia, litros_gastos):
    consumo = distancia / litros_gastos
    print("O consumo medio do percurso foi: ", consumo, "km por litro")

def calcula_valor_gasto(preco_litro, litros_consumidos):
    valor = preco_litro * litros_consumidos
    print("O custo total do percurso foi: ", valor, "reais")


if(__name__=="__main__"):   # esse comando compara se a váriável name tem o mesmo valor da variável main.
    main()