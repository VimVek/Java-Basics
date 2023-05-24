package associationAggregationComposition;

import java.util.List;

public class LibraryC {
    private List<BookC> books;
    public LibraryC(List<BookC> books){
        this.books = books;
    }

    public List<BookC> getTotalBooksInLibrary(){
        return books;
    }
}
