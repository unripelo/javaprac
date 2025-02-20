import java.util.ArrayList;

public class array { 
  public static void main(String[] args) { 
    ArrayList<String> authors = new ArrayList<String>();
    authors.add("Jonaxx");
    authors.add("April Avery");
    authors.add("Beeyotch");
    
    authors.add(0, "Cleverious"); // Insert element at the beginning of the list (index 0)

    System.out.println(authors);
  } 
}
