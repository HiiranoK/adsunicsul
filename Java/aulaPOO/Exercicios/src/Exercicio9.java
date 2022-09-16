import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double valor1,valor2,valor3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor para o 1º numero: ");
        valor1 = sc.nextDouble();
        System.out.println("Informe o valor para o 2º numero: ");
        valor2 = sc.nextDouble();
        System.out.println("Informe o valor para o 3º numero: ");
        valor3 = sc.nextDouble();
        sc.close();
        System.out.println("O maior valor entre " +valor1 +" e "+ valor2 +" é: " + maiorEntreDois(valor1, valor2));
        System.out.println("O maior valor entre " +valor1 +", "+ valor2+ " e "+ valor3+ " é " +maiorEntreTres(valor1, valor2, valor3));
    }

    public static double maiorEntreDois(double a, double b){
        if(a > b){
            return a;
        }return b;
    }
    public static double maiorEntreTres(double a, double b, double c){
        if(a > b && a > c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
}
