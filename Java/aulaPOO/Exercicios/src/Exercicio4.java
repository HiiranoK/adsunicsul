import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do raio(em cm)");
        double raio = sc.nextDouble();
        sc.close();
        double diametro = raio*2;
        double circunferencia = Math.PI * diametro;
        double area = Math.PI*Math.pow(raio, 2);
        System.out.println("O valor do diametro é: " + diametro + "cm\nO valor da circunferencia é: "+ circunferencia
        +"cm\n o valor da área é:"+ area+"cm²");
    }
}
