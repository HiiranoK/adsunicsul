public class App {
    public static void main(String[] args) {
        // declarando array com valores:
        Veiculo[] veiculos = {
            new Caminhao("Mercedes-Bens", 400000.00),
            new Carro("Fusca", 15000.00),
            new Moto("Kawasaki", 200000.00),
            new Carro("Corsa",30000.00),
            new Caminhao("Volvo", 250000.00),
            null,
            null,
            null
        };
        // adicionando novos valores ao array:
        veiculos[5] = new Moto("Honda", 25000.00);
        veiculos[6] = new Carro("Kombi", 25000.00);
        veiculos[7] = new Caminhao("DAF", 350000.00);

        insertionSort(veiculos, 0, veiculos.length);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        selectionSort(veiculos, 0, veiculos.length);
    }

    private static void imprime(Veiculo[] veiculos) {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getNome() + " custa " + veiculo.getPreco());
        }
    }

    private static void insertionSort(Veiculo[] veiculos, int inicio, int termino) {
        for (int i = inicio; i < veiculos.length; i++) {
            int analise = i;
            while (analise > 0 && veiculos[analise].getPreco() < veiculos[analise -1].getPreco()) {
                trocaItens(veiculos, analise, analise-1);
                analise--;
            }
        }
        System.out.println("Insertion Sort");
        imprime(veiculos);
    }

    public static int retornaMenorCusto(Veiculo[] produtos,int inicio, int termino){
        int menorValor = inicio;
        for (int atual = inicio; atual < termino ; atual++) {
            if(produtos[atual].getPreco() < produtos[menorValor].getPreco()){
                menorValor = atual;
            }
        }
        return menorValor;
    }


    public static void selectionSort(Veiculo[] veiculos,int inicio,int termino){
        for(int atual = inicio; atual < termino; atual++){

            int menorCusto = retornaMenorCusto(veiculos, atual, termino);
            trocaItens(veiculos, atual, menorCusto);
        }
        System.out.println("Selection Sort");
        imprime(veiculos);
    }

    private static void trocaItens(Veiculo[] produtos, int primeiro, int segundo) {
        Veiculo veiculoAtual = produtos[primeiro];
        Veiculo veiculoMenor = produtos[segundo];

        produtos[primeiro] = veiculoMenor;
        produtos[segundo] = veiculoAtual;
    }

}
