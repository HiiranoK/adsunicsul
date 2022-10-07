import java.util.Scanner;

public class mercado2 {
    public static void main(String[] args) {
        int porcentagemPromocao = 5;
        int itemMatch = 0;
        String[] frutasPromocao ={
            "banana",
            "maca",
            "goiaba",
            "laranja",
            "melao"
        };
        String[] frutasCliente = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Preencha uma lista de 5 itens");
        preencheLista(frutasCliente, sc);
        sc.close();
        
        itemMatch = comparaListas(itemMatch, frutasPromocao, frutasCliente);
        System.out.println(itemMatch +" Itens correspondentes. Você tem direito a: " + itemMatch*porcentagemPromocao + "% de desconto");
    }
    private static int comparaListas(int itemMatch, String[] frutasPromocao, String[] frutasCliente) {
        for(int fc = 0; fc< frutasCliente.length;fc++){
            for(int fp = 0; fp < frutasPromocao.length;fp++)
            if(frutasCliente[fc].equalsIgnoreCase(frutasPromocao[fp])){
                System.out.println("item match");
                itemMatch+=1;
            }
        }
        return itemMatch;
    }
    private static void preencheLista(String[] frutasCliente, Scanner sc) {
        for(int i=0;i< frutasCliente.length;i++){

            System.out.println("informe o " + (i+1) + "º item");
            String fruta = sc.nextLine();
            System.out.println("item: "+fruta);
            frutasCliente[i] = fruta;
        }
    }
}
