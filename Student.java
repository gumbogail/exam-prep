import java.util.ArrayList;
import java.util.List;



public class Student{
    private String Name;
    private int ID;
    private String bookreturnDate;
    private ArrayList<Student > student;

    public Student(String Name, int ID,String bookreturnDate){
        this.Name= Name;
        this.ID=ID;
    }
    public String getName(){
        return Name;

    }

    public int getID(){
        return ID;
        
    }

    public String getBookReturnDate(){
        return bookreturnDate;
    }

    
         }

    
