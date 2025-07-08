*Fawry Rise up Journey Task #2*

The following project is a simple Online Bookstore system Design using OOP principles and java programming Language:

1) Class Diagram
![Online Bookstore Class Diagram](https://github.com/user-attachments/assets/68e58b32-5e3c-4a0f-a44c-0ed7b4588a75)

2) Classes logic and structure:

## Class Structure and Logic

### Core Classes

- **`Book`** (Abstract Base Class)
  - Properties: ISBN, title, year published, price
  - Base class for all book types

- **`Paperbook`** (Extends Book)
  - Implements `Shippable` interface
  - Manages stock quantity
  - Handles physical shipments

- **`Ebook`** (Extends Book)
  - Contains file type attribute
  - Handles email delivery
  - No physical stock

- **`Demo`** (Extends Book)
  - Showcase items not for sale
  - Zero price by default

### Supporting Classes

- **`Customer`**
  - Stores: name, email, address, phone
  - Used for purchase processing

- **`Bookstore`** (Main Controller)
  - Manages book inventory (add/remove)
  - Processes purchases
  - Handles outdated book removal
  - Coordinates shipping/delivery

- **`ShippingService`**
  - Handles physical book shipments
  - Prints shipping information

- **`MailService`**
  - Manages ebook deliveries
  - Sends files via email

- **`Shippable`** (Interface)
  - Implemented by Paperbook
  - Enables shipping capability

## Key Features

### Inventory Management
- Add/remove all book types (physical, digital, demo)
- Automatic removal of outdated books (configurable year threshold)
- Real-time stock tracking for physical books

### Purchase Processing
- **Physical Books**:
  - Stock availability validation
  - Automatic stock reduction on purchase
  - Shipping service integration

- **Ebooks**:
  - Instant email delivery
  - File type support (PDF, EPUB, etc.)
  - No stock limitations

- **Demo Books**:
  - Purchase prevention
  - Clear identification in system

### Delivery System
- Physical books processed through `ShippingService`
- Ebooks delivered via `MailService`
- Automatic address/email validation

### OOP Design Principles
- **Abstraction**: `Book` base class
- **Inheritance**: All book types extend `Book`
- **Interface**: `Shippable` for shipping capability
- **SOLID Compliance**:
  - Open/Closed principle (extensible for new book types)
  - Single Responsibility for each class
  - Liskov Substitution for book types

### Error Handling
- Comprehensive validation for:
  - Book availability
  - Stock levels
  - Customer information
  - Purchase eligibility (blocks demo books)
- Clear error messages for all failure cases

4) Sample test output:

![Test](https://github.com/user-attachments/assets/6dccd8d2-083f-4d49-9c28-a961d8031667)



