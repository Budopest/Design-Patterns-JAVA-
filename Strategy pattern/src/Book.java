public class Book {

    private String bookName ;
    private String bookAuthor;
    enum BookType {Audio,Paper};
    BookType bookType;
    private SaleBehaviour saleBehaviour;

    public Book(String bookName,String bookAuthor,SaleBehaviour saleBehaviour){
        this(bookName,bookAuthor);
        this.saleBehaviour = saleBehaviour;
    }

    private Book(String bookName,String bookAuthor){
        this(bookName);
        this.bookAuthor = bookAuthor;

    }
    private Book(String bookName){
        this.bookName = bookName;

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

    public BookType getBookType() {
        return bookType;
    }

    public void saleBehaviour(){
        saleBehaviour.sale();
    }
    public void setSaleBehaviour(SaleBehaviour saleBehaviour){
        this.saleBehaviour = saleBehaviour;
    }
}
