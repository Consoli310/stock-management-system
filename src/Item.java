public class Item {

    private String name;
    private int id;
    private int quantity;
    private double purchasePrice;
    private double sellingPrice;

    public Item(){
    }

    public Item(String name, double purchasePrice, double sellingPrice, int quantity, int id) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString(){
        return "Item: "
                + getName() + "\n"
                + "Selling Price: "
                + getSellingPrice() + "\n"
                +"Purchase Price: "
                + getPurchasePrice() + "\n"
                + "Quantity: "
                + getQuantity() + "\n"
                + "ID: "
                + getId() + "\n";
    }
}
