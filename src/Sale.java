import java.time.LocalDateTime;

public class Sale{
    private LocalDateTime localDateTime;
    private Item item;
    private Stock stock;

    public Sale(LocalDateTime localDateTime, Item item, Stock stock) {
        this.localDateTime = localDateTime;
        this.item = item;
        this.stock = stock;
    }

    public Sale(Stock stock){
        this.stock = stock;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void purchase(int id, int quantity){
        for (Item items : stock.getItemList()){
            if (items.getId() == id){
                items.setQuantity((items.getQuantity() - quantity));
            }
        }
    }
}
