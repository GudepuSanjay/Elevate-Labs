import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int book_id;
    private String book_name;
    private String author_name;
    private boolean isIssued = false;

    public Book(int id, String book_name, String author_name) {
        this.book_id = id;   
        this.book_name = book_name;
        this.author_name = author_name;
    }

    public String getBookName() {
        return book_name;
    }

    public int getBookId() {
        return book_id;
    }

    public void setBookName(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author_name;
    }

    public void setAuthor(String author_name) {
        this.author_name = author_name;
    }

    public boolean isIssued() {   
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    @Override
    public String toString() {
        return "Book Id: " + book_id + ", Book Name: " + book_name + ", Author Name: " + author_name +
               (isIssued ? " [Issued]" : " [Available]");
    }
}

class User {
    private int user_id;
    private String user_name;
    private String roll_no;

    public User(int user_id, String user_name, String roll_no) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.roll_no = roll_no;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getRollNo() {
        return roll_no;
    }

    public void setRollNo(String roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "User Id: " + user_id + ", User Name: " + user_name + ", Roll No: " + roll_no;
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        Scanner obj = new Scanner(System.in);

        // sample books
        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(2, "C Programming", "Dennis Ritchie"));
        books.add(new Book(3, "Python Programming", "Guido van Rossum"));

        // sample users
        users.add(new User(1, "Sanjay", "1244"));
        users.add(new User(2, "Upesh", "12A0"));
        users.add(new User(3, "Sai Kiran Reddy", "12C8"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. View users");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = obj.nextInt();

            switch (ch) {
                case 1:
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    break;

                case 2:
                    System.out.println("Enter Book id to Issue:");
                    int issueId = obj.nextInt();
                    boolean foundIssue = false;
                    for (Book b : books) {
                        if (b.getBookId() == issueId) {
                            foundIssue = true;
                            if (!b.isIssued()) {
                                b.setIssued(true);
                                System.out.println("Book issued successfully: " + b.getBookName());
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            break;
                        }
                    }
                    if (!foundIssue) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book id to return: ");
                    int returnId = obj.nextInt();
                    boolean foundReturn = false;
                    for (Book b : books) {
                        if (b.getBookId() == returnId) {
                            foundReturn = true;
                            if (b.isIssued()) {
                                b.setIssued(false);
                                System.out.println("Book returned successfully: " + b.getBookName());
                            } else {
                                System.out.println("This book was not issued.");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    for (User u : users) {
                        System.out.println(u);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
