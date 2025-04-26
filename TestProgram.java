
public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Alice");

        LibraryResource book = new Book("Introduction to Java");
        LibraryResource journal = new Journal("AI Research 2025");
        LibraryResource newspaper = new Newspaper("Daily News");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(newspaper);
    }
}
