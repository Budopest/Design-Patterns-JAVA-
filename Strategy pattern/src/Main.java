public class Main {

    public static void main(String[] args) {

        AudioBook audioBook = new AudioBook("12 rules for life","jordan peterson",new SaleOnCd()) ;
        PaperBook paperBook = new PaperBook("Advanced Topics in C","Noel Kalicharan",new SalePhysicalCopy());

        System.out.println("BOOK NAME  : " + audioBook.getBookName() +"\n" +
                "Author NAME  : " + audioBook.getBookAuthor() +"\n" +
                "Book type : " + audioBook.bookType + "\n");

        //audioBook.saleBehaviour.sale();
        audioBook.saleBehaviour();
        audioBook.setSaleBehaviour(new SaleOnline());
        audioBook.saleBehaviour();
    }
}
