import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de º em celsios:");
        double valor = sc.nextDouble();
        sc.close();
        System.out.println("O valor em Farenheit é: " + farenheit(valor)+"º"+
         "\n Já para Kelvin é:" + kelvin(valor)+"º");
    }

    public static double farenheit(double valor){
        double valorConvertido = 1.8 * valor + 32;
        return valorConvertido;
    }
    public static double kelvin(double valor){
        double valorConvertido = valor + 273.15;
        return valorConvertido;
    }
}
