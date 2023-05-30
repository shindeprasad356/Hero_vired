import java.util.Scanner;

public class LibraryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[10];
        int bookCount = 0;

        while (true) {
            System.out.println("Enter 1 to add a book");
            System.out.println("Enter 2 to delete a book");
            System.out.println("Enter 3 to exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (bookCount >= books.length) {
                    System.out.println("The library is full.");
                } else {
                    System.out.println("Enter the name of the book:");
                    String bookName = scanner.next();
                    books[bookCount] = bookName;
                    bookCount++;
                    System.out.println("The book has been added to the library.");
                }
            } else if (choice == 2) {
                if (bookCount == 0) {
                    System.out.println("The library is empty.");
                } else {
                    System.out.println("Enter the name of the book to delete:");
                    String bookName = scanner.next();
                    boolean bookFound = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equals(bookName)) {
                            bookFound = true;
                            for (int j = i; j < bookCount - 1; j++) {
                                books[j] = books[j + 1];
                            }
                            bookCount--;
                            System.out.println("The book has been deleted from the library.");
                            break;
                        }
                    }
                    if (!bookFound) {
                        System.out.println("The book was not found in the library.");
                    }
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
