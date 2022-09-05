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

        System.out.println("Lista não ordenada");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getNome() + " valor: " + veiculo.getPreco());
        } 

        Veiculo[] ordenado = ordenaLista(veiculos, 0, veiculos.length);
        System.out.println("Listando itens a partir do menor preço:");
        for (Veiculo veiculo : ordenado) {
            System.out.println(veiculo.getNome() + " valor " + veiculo.getPreco());
        }
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

    public static Veiculo[] ordenaLista(Veiculo[] produtos,int inicio,int termino){
        for(int atual = inicio; atual < termino; atual++){

            int menorCusto = retornaMenorCusto(produtos, atual, termino);
            Veiculo veiculoAtual = produtos[atual];
            Veiculo veiculoMenor = produtos[menorCusto];

            produtos[atual] = veiculoMenor;
            produtos[menorCusto] = veiculoAtual;
        }
        return produtos;
    }


}
