import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da base");
        double base = sc.nextDouble();
        System.out.println("Informe o valor da altura");
        double altura = sc.nextDouble();
        sc.close();
        double area = base*altura/2;
        System.out.println("A area do triangulo é:" + area + "cm²");
    }
}
