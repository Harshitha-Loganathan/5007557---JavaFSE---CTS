import java.util.Arrays;

public class BookSearch {

    // Linear search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search (Assuming array is sorted by title)
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareTo(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "1984", "George Orwell"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(4, "Moby Dick", "Herman Melville")
        };

        // Linear Search
        System.out.println("Linear Search - Book is at address: " + linearSearch(books, "The Great Gatsby"));

        // Sorting books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        // Binary Search
        System.out.println("Binary Search - Book is at address: " + binarySearch(books, "The Great Gatsby"));
    }
}
