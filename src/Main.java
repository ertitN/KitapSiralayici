import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kitap İsmine Göre Sıralama");
        System.out.println("***************************");

        Set<Book> book = new TreeSet<>();
        book.add(new Book("Animal Farm",250,"George Orwell","17.08.1945"));
        book.add(new Book("East of Eden",550,"John Steinbeck","19.09.1952"));
        book.add(new Book("The House of Mirth",4000,"Edith Wharton","14.10.1905"));
        book.add(new Book("A Time To Kill",750,"John Grisham","XX.XX.1989"));
        book.add(new Book("A Scanner Darkly",530,"Philip K. Dick","XX.XX.1977"));


       Iterator<Book> iterator = book.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("\n********************************************************\n");
        System.out.println("Sayfa Sayısına Göre Sıralama\n");

        Set<Book> bookSet = new TreeSet<>(Comparator.comparing(Book::getNumberOfPages));


        bookSet.addAll(book);

           for(Book b:bookSet){
                System.out.println(b.toString());
           }

}
}
