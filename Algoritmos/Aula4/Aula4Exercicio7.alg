algoritmo Exercicio7
    real tamanhoEscada, alturaQuadro;
    início
        escreva("Informe o tamanho da escada");
        leia(tamanhoEscada);
        escreva("Informe aonde deve ficar o quadro ( deve ser menor que a escada)");
        leia(alturaQuadro);
        se(tamanhoEscada < alturaQuadro){
            escreva("A escada é menor que o quadro");
            pare;
        }senao{
            escreva("A escada precisa ficar a uma distância de: " + CalculaCatetoAdjacente(tamanhoEscada,alturaQuadro));
        }
    fim

real CalculaCatetoAdjacente(real escada, real parede){
    real distanciaEscada;
    distanciaEscada = raiz( escada^2 - parede ^2)
    return distanciaEscada;
}