public class AudioBook extends Book {

    public AudioBook(String bookName, String bookAuthor,SaleBehaviour saleBehaviour) {
        super(bookName, bookAuthor, saleBehaviour);
        bookType = bookType.Audio;
    }


}
