import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos produtos?");
        int n = sc.nextInt();
        sc.nextLine();

        Stock stock = new Stock();
        Sale sales = new Sale(stock);

        for(int i = 0; i < n ; i++) {
            System.out.println("Nome");
            String name = sc.nextLine();
            System.out.println("Preço de compra");
            double purchsePrice = sc.nextDouble();
            System.out.println("Preço de venda");
            double sellingPrice = sc.nextDouble();
            System.out.println("Quantidade");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("ID");
            int id = sc.nextInt();
            sc.nextLine();
            Item item = new Item(name, purchsePrice, sellingPrice, quantity, id);
            stock.addItem(item);
        }

        stock.viewStock();


        System.out.println("qual o id?");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("quantos para remover?");
        int quantos = sc.nextInt();
        sc.nextLine();

        sales.purchase(id, quantos);

        stock.viewStock();

    }
}
