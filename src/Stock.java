import java.util.ArrayList;
import java.util.List;

public class Stock extends Item{

    private List<Item> itemList = new ArrayList<>();


    public Stock(List<Item> itemList) {
        this.itemList = itemList;
    }
    public Stock(){}


    public void addItem(Item item){
       this.itemList.add(item);
    }

    public void viewStock(){
        for (Item item : itemList){
            System.out.println(item);
        }
    }

    public void removeItemById(int id){
        for (int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            if(item.getId() == id){
                itemList.remove(i);
            }
        }
    }

    public void updateItemById(int id, String NewName, double NewPurchasePrice, double NewSellingPrice, int NewQuantity, int NewId){
        for (int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            if (item.getId() == id){
              item.setName(NewName);
              item.setPurchasePrice(NewPurchasePrice);
              item.setSellingPrice(NewSellingPrice);
              item.setQuantity(NewQuantity);
              item.setId(NewId);

            }
        }
    }
}
