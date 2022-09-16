package Java;

public class Incremento {
    public static void main(String[] args) {
        int contador = 0;
        int soma = 0;
        while (contador <= 100) {
            soma += contador;
            contador++;
        }
        System.out.println("A soma de todos os valores de 0 a 100 é: " + soma);
    }
}
