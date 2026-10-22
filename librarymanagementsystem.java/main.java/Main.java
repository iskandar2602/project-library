public class Main {
    public static void main(String[] args) {

        // Default constructor
        Book book1 = new Book();
        System.out.println("=== Default book ===");
        book1.displayDetails();

        // Attribute manipulation using SETTERS
        book1.setBookId("B001");
        book1.setTitle("Java Basics");
        book1.setAuthor("Ali");
        book1.setGenre("Education");
        book1.setPublicationYear(2020);
        book1.setPrice(45.50);
        book1.setAvailable(true);

        // Attribute reading using GETTERS
        System.out.println();
        System.out.println("=== After using setters ===");
        System.out.println("Title  : " + book1.getTitle());
        System.out.println("Author : " + book1.getAuthor());
        System.out.println("Price  : RM " + book1.getPrice());

        // Parameterized constructor
        Book book2 = new Book("B002", "Story Time", "Siti", "Fiction", 2015, 30.00, false);
        Book book3 = new Book("B003", "Math Fun", "Ben", "Science", 2022, 25.00, true);

        // Store all books in an array
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        // FOR loop: show every book
        System.out.println();
        System.out.println("=== All books ===");
        for (int i = 0; i < books.length; i++) {
            System.out.println("--- Book " + (i + 1) + " ---");
            books[i].displayDetails();
        }

        // FOR loop + IF/ELSE selection: try to borrow every book
        System.out.println();
        System.out.println("=== Borrowing ===");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isAvailable()) {
                books[i].borrowBook();
                System.out.println(books[i].getTitle() + " was borrowed.");
            } else {
                System.out.println(books[i].getTitle() + " is not available.");
            }
        }

        // SWITCH selection: check the genre
        System.out.println();
        System.out.println("=== Genre check ===");
        String genre = books[1].getGenre();
        switch (genre) {
            case "Education":
                System.out.println("This is an education book.");
                break;
            case "Fiction":
                System.out.println("This is a fiction book.");
                break;
            default:
                System.out.println("This is another type of book.");
        }

        // WHILE loop: count books published from 2018
        int count = 0;
        int j = 0;
        while (j < books.length) {
            if (books[j].isPublishedFrom(2018)) {
                count++;
            }
            j++;
        }
        System.out.println();
        System.out.println("Books published from 2018: " + count);

        // Return a book and change the price with a setter
        books[1].returnBook();
        books[1].setPrice(35.00);
        System.out.println();
        System.out.println(books[1].getTitle() + " returned. New price: RM " + books[1].getPrice());
    }
}