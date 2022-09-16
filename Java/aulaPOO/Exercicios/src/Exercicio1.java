import java.util.Scanner;

public class Exercicio1 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o 1º numero");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o 2º numero");
        double numero2 = sc.nextDouble();
        sc.close();
        operacoes(numero1, numero2);
    }

    public static double soma(double x,double y){
        return x + y;
    }
    public static double subtrai(double x,double y){
        return x - y;
    }
    public static double multiplica(double x,double y){
        return x * y;
    }
    public static double divide(double x,double y){
        return x / y;
    }

    public static void operacoes(double x,double y){
        System.out.println("Os resultados para a operação de soma é: " + soma(x, y));
        System.out.println("Os resultados para a operação de subtração é: " + subtrai(x, y));
        System.out.println("Os resultados para a operação de multiplicação é: " + multiplica(x, y));
        System.out.println("Os resultados para a operação de divisão é: " + divide(x, y));
    }
}