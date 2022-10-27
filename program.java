import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    
    public class program {
        public static void main(String[] args) {

            List<Books> books= new ArrayList();
            Books b1 = new Books("as we are ","abi","magazine");
            Books b2 =new Books ("life and living ","abi","magazine");
            Books b3 = new Books("little miss perfect ","gumbo","novel");
            Books b4 = new Books("verified","gail","novel");
            Books b5 = new Books("the science of science","abi","text book");

            books.add(b1);
            books.add(b2);
            books.add(b3);
            books.add(b4);
            books.add(b5);

            System.out.println("what book name to check availability");
            Scanner sc= new Scanner(System.in);
            String S = sc.nextLine();
            library.checkAvailability(S);

        }


        
    }

