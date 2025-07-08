public abstract class Book{
    private String ISBN;
    private String title;
    private int yearPublished;
    private double price;


    public Book(String ISBN,String title,int yearPublished,double price){
        this.title=title;
        this.ISBN=ISBN;
        this.yearPublished=yearPublished;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public int getYear(){
        return yearPublished;
    }
    public void setYear(int yearPublished){
        this.yearPublished=yearPublished;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}