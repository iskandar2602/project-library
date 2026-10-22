public class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private double price;
    private boolean available;

    // Default constructor.
    public Book() {
        this.bookId = "N/A";
        this.title = "Untitled";
        this.author = "Unknown";
        this.genre = "Unspecified";
        this.publicationYear = 0;
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor (no method calls inside).
    public Book(String bookId, String title, String author, String genre,
                int publicationYear, double price, boolean available) {

        if (bookId != null && !bookId.trim().isEmpty()) {
            this.bookId = bookId;
        } else {
            this.bookId = "N/A";
        }

        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            this.title = "Untitled";
        }

        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            this.author = "Unknown";
        }

        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        } else {
            this.genre = "Unspecified";
        }

        if (publicationYear >= 0) {
            this.publicationYear = publicationYear;
        } else {
            this.publicationYear = 0;
        }

        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }

        this.available = available;
    }

    // Getters.
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getPublicationYear() { return publicationYear; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }

    // Setters with basic validation.
    public void setBookId(String value) {
        if (value != null && !value.trim().isEmpty()) {
            bookId = value;
        } else {
            bookId = "N/A";
        }
    }

    public void setTitle(String value) {
        if (value != null && !value.trim().isEmpty()) {
            title = value;
        } else {
            title = "Untitled";
        }
    }

    public void setAuthor(String value) {
        if (value != null && !value.trim().isEmpty()) {
            author = value;
        } else {
            author = "Unknown";
        }
    }

    public void setGenre(String value) {
        if (value != null && !value.trim().isEmpty()) {
            genre = value;
        } else {
            genre = "Unspecified";
        }
    }

    public void setPublicationYear(int value) {
        if (value >= 0) {
            publicationYear = value;
        } else {
            publicationYear = 0;
        }
    }

    public void setPrice(double value) {
        if (value >= 0) {
            price = value;
        } else {
            price = 0.0;
        }
    }

    public void setAvailable(boolean value) {
        available = value;
    }

    // Borrow a book only when it is available.
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    // Return a book only when it is currently borrowed.
    public boolean returnBook() {
        if (!available) {
            available = true;
            return true;
        }
        return false;
    }

    // Check whether the book was published in or after a given year.
    public boolean isPublishedFrom(int year) {
        return publicationYear >= year;
    }

    // Display all details.
    public void displayDetails() {
        System.out.println("Book ID          : " + bookId);
        System.out.println("Title            : " + title);
        System.out.println("Author           : " + author);
        System.out.println("Genre            : " + genre);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("Price            : RM " + price);
        if (available) {
            System.out.println("Status           : Available");
        } else {
            System.out.println("Status           : Borrowed");
        }
    }
}