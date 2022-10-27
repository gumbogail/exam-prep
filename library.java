import java.util.ArrayList;
import java.util.List;

public class library {
    private static List<Books> books;

    public library (String Books, List<Books> books)
    {
        this.books= books = new ArrayList<>();
    }

    public List<Books> getBooks(){
        return books;
    }

    public static String checkAvailability(String S){

        for (Books books:  books) 
        {
            if (books.getTitle().equals(S))
             {
                System.out.println(S);
            
        
            }
         }
        return S;            
    }
}