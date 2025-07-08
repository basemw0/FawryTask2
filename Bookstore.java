import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Bookstore {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book){
        inventory.add(book);
    }
    public List<Book> removeOutdatedBooks(int years) {
        List<Book> outdatedBooks = new ArrayList<>();
        List<Book> booksToRemove = new ArrayList<>();
        
        for (Book book : inventory) {
            if (LocalDate.now().getYear() - book.getYear() < years) {
                outdatedBooks.add(book);
                booksToRemove.add(book);
            }
        }
        
        inventory.removeAll(booksToRemove);
        return outdatedBooks;
    }
    
    public void buyBook(String ISBN, Customer customer) {
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN)) {
                if (book instanceof Paperbook) {
                    Paperbook paperBook = (Paperbook) book;
                    if (paperBook.getStock() >= 1) {
                        paperBook.reduceStock();
                        ShippingService.sendItems(paperBook, customer.getAddress());
                    } else {
                        throw new IllegalArgumentException("Not enough stock");
                    }
                }
                
                else if (book instanceof Ebook) {
                    Ebook ebook = (Ebook) book;
                    ebook.sendEmail(customer.getEmail());
                }
                
                else if (book instanceof Demo) {
                    throw new IllegalArgumentException("Demo books are not for sale");
                }
                
                return;
            }
        }
        throw new IllegalArgumentException("Book not found");
    }
    
    public void reduceQuantity(String ISBN) {
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN) && book instanceof Paperbook) {
                ((Paperbook) book).reduceStock();
                return;
            }
        }
        throw new IllegalArgumentException("Book not found or not a paper book");
    }
    
    public List<Book> getInventory() {
        return inventory;
    }
}
