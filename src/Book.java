
public class Book implements Comparable<Book>{
    private String bookName;
    private int numberOfPages;
    private String author;
    private String releaseDate;

    public Book(String bookName, int numberOfPages, String author, String releaseDate) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.releaseDate = releaseDate;
    }


    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }


    public String toString(){
            return "Kitap adı:\t"+this.getBookName()+
                    "\t\tSayfa Sayısı:"+this.getNumberOfPages()+
                    "\t\tYazar: "+this.getAuthor()+
                    "\t\tYayın Tarihi: "+this.getReleaseDate();

    }



    @Override
    public int compareTo(Book b) {
        return this.getBookName().compareTo(b.getBookName());
    }




}
