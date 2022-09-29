public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;
    public static int BOOK_COUNTER = 0;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        Book.BOOK_COUNTER++;
    }

   public static void showTotalBookInfo() {
        System.out.println( "total Book:" + Book.BOOK_COUNTER);

    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(int bookCopy) {
        this.bookCopy = bookCopy;
    }

    void ShowBookInfo() {
        System.out.println("Name: " + this.getBookName() +
                "\nAuthor: " + this.getBookAuthor() +
                "\nBook ID: " + this.getBookId() +
                "\nBook Type: " + this.getBookType() +
                "\nBook Copy: " + this.getBookCopy() +
                "\n................");

        //Book.showTotalBookInfo();

    }

    void AddBookCopy(int x) {


        System.out.println("Total Number of Books:" + x+"\n..............");

    }


}
