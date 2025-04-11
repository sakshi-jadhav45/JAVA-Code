import LibraryManagement.Book;
import LibraryManagement.Member;

public class LibrarySystem {
    public static void main(String[] args) {
      
        Book b1 = new Book("Rich dad, Poor Dad", "Robert Kiyosaki", "978-0061122415");

       
        Member m1 = new Member("Sakshi Jadhav", 101);

     
        System.out.println("=== Book Details ===");
        b1.displayBookInfo();

        System.out.println("\n=== Member Details ===");
        m1.displayMemberInfo();
    }
}
