package Java;

public class Multiplos3 {
    public static void main(String[] args) {
        System.out.println("Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100. ");

        for(int numero=1;numero <=100; numero++){ 
            if(numero%3 ==0){
                System.out.print(numero + " ");
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 100; i+=3) {
            if (i ==0 ) {
                i+=3;
            }
            System.out.print(i + " ");
        }
    }
}
