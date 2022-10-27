import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    
    public class program {
        public static void main(String[] args) {

            ArrayList<Books> books= new ArrayList<Books>();
            Books b1 = new Books ("as we are ","abi","magazine");
            Books b2 =new Books ("life and living ","abi","magazine");
            Books b3 = new Books("little miss perfect ","gumbo","novel");
            Books b4 = new Books("verified","gail","novel");
            Books b5 = new Books("the science of science","abi","text book");

            books.add(b1);
            books.add(b2);
            books.add(b3);
            books.add(b4);
            books.add(b5);


            System.out.println(books);

            System.out.println("what book name to check availability");
            try (Scanner sc = new Scanner(System.in)) {
                String S = sc.nextLine();
                library.checkAvailability(S, books);
            }
            

            ArrayList<Student > student = new ArrayList<Student>();
            Student s1 = new Student("anita", 101010, "10/02/2022") ;
            Student s2= new Student("tabitha", 10004, "20/05/2022" );
            Student s3 = new Student("letitia", 101015, "13/02/2022") ;
            Student s4 = new Student("monalisa", 101016, "27/10/2022") ;
            Student s5 = new Student("lisa", 101020, "30/03/2022") ;

            student.add(s1);
            student.add(s2);
            student.add(s3);
            student.add(s4);
            student.add(s5);
            
        }


        
    }

