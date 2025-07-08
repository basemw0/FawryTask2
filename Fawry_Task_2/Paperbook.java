public class Paperbook extends Book  implements Shippable{
    private int stock;

    public Paperbook(String ISBN,String title,int yearPublished,double price,int stock){
        super(ISBN, title, yearPublished, price);
        this.stock = stock;
    }
    
    public void reduceStock(){
        stock -= stock;
    }

    public void increaseStock(){
        stock += stock;
    }

    public int getStock() {
        return stock;
    }
    
    public void setQuantity(int quantity) {
        this.stock = quantity;
    }

    public boolean hasStock(int requestedQuantity) {
        return stock >= requestedQuantity;
    }
}
