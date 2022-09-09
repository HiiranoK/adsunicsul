public class TestaMerge {
    public static void main(String[] args) throws Exception {
        Nota[] notasDoMauricio = {
            new Nota("Andre", 4),
            new Nota("Mariana", 5),
            new Nota("Carlos", 8.5),
            new Nota("Paulo", 9),
            new Nota("jonas", 3),
            new Nota("Julianoa", 6.7),
            new Nota("Guilherme", 7),
            new Nota("Lucia", 9.3),
            new Nota("Ana", 10)
        };
        Nota rank[] = intercala(notasDoMauricio,0,4,notasDoMauricio.length);
        for(Nota nota : rank){
            System.out.println(nota.getAluno());
        }
    }
    private static Nota[] intercala(Nota[] notas, int inicio, int miolo, int termino){
        Nota[] resultado = new Nota[notas.length];
        int atual = 0;
        int atual1 =inicio;
        int atual2 = miolo;
        while(atual1<miolo && atual2 <termino){
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];
            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atual1++;
            }else{
                resultado[atual] = nota2;
                atual2++;
            }
        }atual++;
        while(atual1 < miolo){
            resultado[atual] = notas[atual1];
            atual++;
            atual1++;
        }
        while(atual2<termino){
            resultado[atual]= notas[atual2];
            atual++;
            atual2++;
        }
        return notas;
    }

    private static Nota[] intercala(Nota[] primeiroNotas, Nota[] segundoNotas) {
        int total = primeiroNotas.length + segundoNotas.length;
        Nota resultado[] = new Nota[total];
        int atualPrimeiroNotas = 0;
        int atualSegundoNotas = 0;
        int atual = 0;
        
        while (atualPrimeiroNotas < primeiroNotas.length &&
                atualSegundoNotas < segundoNotas.length) {
            Nota nota1 = primeiroNotas[atualPrimeiroNotas];
            Nota nota2 = segundoNotas[atualSegundoNotas];
            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atualPrimeiroNotas++;
            }else{
                resultado[atual] = nota2;
                atualSegundoNotas++;
            }
            atual++;
        }
        while(atualPrimeiroNotas < primeiroNotas.length){
            resultado[atual]= primeiroNotas[atualPrimeiroNotas];
            atual ++;
            atualPrimeiroNotas++;
        }
        while(atualSegundoNotas < segundoNotas.length){
            resultado[atual]= segundoNotas[atualSegundoNotas];
            atual++;
            atualSegundoNotas++;
        }
        
        return resultado;
    }


}
