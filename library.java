import java.util.ArrayList;
import java.util.List;

public class library {
    private static  ArrayList<Books> books;
    private ArrayList<Student > student;

    public library ( ArrayList<Books> books)

    {
        library.books= new ArrayList<Books>(); 
    }

    public List<Books> getBooks(){
        return books;
    }

    public static  int checkAvailability(String S,  ArrayList<Books> books){

        for (int i = 0; i < books.size(); i++) 
        {
            if (books.get(i).getTitle().equals(S))
             {
                System.out.println(S + " is available");
             return i;
        
            }
         }
        return -1;            
    }
// method that counts books to be returned on a certain date 
    public int  getReturndate(String bookreturnDate)
    {
        int count =0;
        for (int i=0 ; i< student.size(); i++){
            if(student.get(i).getBookReturnDate().equals(bookreturnDate))
            count++;
        }
        return count;
    }
      
}