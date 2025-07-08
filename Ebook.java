public class Ebook extends Book {
    private String filetype;
    public Ebook(String ISBN,String title,int yearPublished,double price,String filetype){
        super(ISBN, title, yearPublished, price);
        this.filetype=filetype;
    }

    public void setType(String type){
        this.filetype=type;
    }
    public String getType(){
        return filetype;
    }
    public void sendEmail(String email){
         System.out.println("Email sent to " + this.getTitle() + " to " + email);
    }
}
