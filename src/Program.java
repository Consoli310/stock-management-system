import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos produtos?");
        int n = sc.nextInt();
        sc.nextLine();

        Stock stock = new Stock();

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
            stock.addItem(new Item(name, purchsePrice, sellingPrice, quantity, id));
        }

        stock.viewStock();

        System.out.println("digite o Id de qual item vc quer atualizar:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("New name");
        String name = sc.nextLine();
        System.out.println("New purchase price");
        double price = sc.nextDouble();
        System.out.println("New selling price");
        double pricesell = sc.nextDouble();
        System.out.println("New quantity");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("New ID");
        int newId = sc.nextInt();
        sc.nextLine();

        stock.updateItemById(id, name, price, pricesell, quantity, newId);

        stock.viewStock();



    }
}
