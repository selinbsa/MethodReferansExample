import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        /*
         Using method reference to print list elements
         The forEach method applies printing on each element of the list
         System.out::println is a method reference to the System.out.println method
         This reference is used to print each element of the list
         */

        names.forEach(System.out::println);  // Method reference: calls the println method
    }
}
