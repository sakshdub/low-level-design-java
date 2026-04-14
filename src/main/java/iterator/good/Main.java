package iterator.good;

import iterator.good.iterator.BookCollectionV2;
import iterator.good.iterator.Iterator;
import iterator.good.model.Book;

public class Main {
    public static void main(String[] args){
        BookCollectionV2 collection=new BookCollectionV2();
        collection.addBook(new Book("Book 1"));
        collection.addBook(new Book("Book 2"));
        Iterator<Book> iterator=collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
