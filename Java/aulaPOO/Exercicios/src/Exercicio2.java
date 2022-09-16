import java.util.Scanner;
/*exercicios 2 e 3 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento");
        double valor1 = sc.nextDouble();
        System.out.println("Informe a largura");
        double valor2 = sc.nextDouble();
        sc.close();
        System.out.println("O valor do perimetro é:" + perimetro(valor1,valor2));
        System.out.println("O valor da area é:" + area(valor1,valor2));
    }
    public static double perimetro(double um, double dois){
        double perimetro = um + um + dois + dois;
        return perimetro;
    }
    public static double area(double um, double dois){
        double area = um * dois;
        return area;
    }
}
