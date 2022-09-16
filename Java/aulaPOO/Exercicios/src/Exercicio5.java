import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento em centimetros");
        double valor = sc.nextDouble();
        sc.close();
        double metros = valor /100;
        double quilometros = metros /1000;
        System.out.println("A distancia convertida para metros é:" + metros + "\n já para quilometros é:" + quilometros);
    }
}
