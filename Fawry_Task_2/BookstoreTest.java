import java.util.List;

public class BookstoreTest {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        
        Customer Basem = new Customer("011111111", "Beso@gmail.com", "Basem Walid", "Maadi") {};
        Customer Adam = new Customer("012132455", "adam@hotmail.com", "Adam dodo", "street 403") {};
        
        testAddBooks(bookstore);
        
        testRemoveOutdatedBooks(bookstore);
        
        testBuyBooks(bookstore, Basem, Adam);
        
        testEdgeCases(bookstore, Basem);
    }
    
    private static void testAddBooks(Bookstore bookstore) {
        System.out.println("\nTesting Adding Books:");
        
        Paperbook paperBook1 = new Paperbook("ISBN001", "Java Programming", 2020, 29.99, 10);
        Paperbook paperBook2 = new Paperbook("ISBN002", "Python Basics", 2022, 24.99, 5);
        
        Ebook ebook1 = new Ebook("ISBN003", "JavaScript Essentials", 2023, 19.99, "PDF");
        Ebook ebook2 = new Ebook("ISBN004", "Data Structures", 2021, 22.99, "EPUB");
        
        Demo demoBook1 = new Demo("ISBN005", "Advanced Algorithms", 2024, 0.00);
        
        bookstore.addBook(paperBook1);
        bookstore.addBook(paperBook2);
        bookstore.addBook(ebook1);
        bookstore.addBook(ebook2);
        bookstore.addBook(demoBook1);
        
        System.out.println("Inventory after adding books:");
        printInventory(bookstore);
    }
    
    private static void testRemoveOutdatedBooks(Bookstore bookstore) {
        System.out.println("\nTesting Removing Outdated Books (older than 3 years):");
        
        List<Book> removedBooks = bookstore.removeOutdatedBooks(3);
        System.out.println("Removed books:");
        for (Book book : removedBooks) {
            System.out.println("- " + book.getTitle() + " (" + book.getYear() + ")");
        }
        
        System.out.println("\nRemaining inventory:");
        printInventory(bookstore);
    }
    
    private static void testBuyBooks(Bookstore bookstore, Customer customer1, Customer customer2) {
        System.out.println("\nTesting Buying Books: ");
        
        // Test buying a paper book
        System.out.println("\nBuying a paper book (Java Programming):");
        try {
            bookstore.buyBook("ISBN001", customer1);
            System.out.println("Purchase successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test buying an ebook
        System.out.println("\nBuying an ebook (JavaScript Essentials):");
        try {
            bookstore.buyBook("ISBN003", customer2);
            System.out.println("Purchase successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test buying a demo book
        System.out.println("\nAttempting to buy a demo book (Advanced Algorithms):");
        try {
            bookstore.buyBook("ISBN005", customer1);
            System.out.println("Purchase successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nInventory after purchases:");
        printInventory(bookstore);
    }
    
    private static void testEdgeCases(Bookstore bookstore, Customer customer) {
        System.out.println("\nTesting Edge Cases: ");
        
        // Test buying non-existent book
        System.out.println("\nAttempting to buy non-existent book:");
        try {
            bookstore.buyBook("ISBN999", customer);
            System.out.println("Purchase successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        try {
            bookstore.buyBook("ISBN001", customer);
            System.out.println("Purchase successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void printInventory(Bookstore bookstore) {
        for (Book book : bookstore.getInventory()) {
            System.out.print("- " + book.getTitle() + " (" + book.getYear() + ")");
            
            if (book instanceof Paperbook) {
                System.out.println(" Paperbook, Stock: " + ((Paperbook) book).getStock() );
            } else if (book instanceof Ebook) {
                System.out.println(" Ebook, Type: " + ((Ebook) book).getType() );
            } else if (book instanceof Demo) {
                System.out.println(" Demo Book ");
            }
        }
    }
}