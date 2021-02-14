import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInJava {
    public static void main(String argsp[]){
        List<String> personNames = new ArrayList<String>();
        personNames.add("Sriram");
        personNames.add("Madhangi");
        personNames.add("Bala");
        personNames.add("Srinivasan");
        personNames.add("Viswanathan");
        personNames.add("Naveen");

        System.out.println("Before Sorting....");
        System.out.println(personNames);
        Collections.sort(personNames);
        System.out.println("After Sorting....");
        System.out.println(personNames);

    }




}
