import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setcollection {

    public static void main(String[] args){

        Set<String> s1 = new LinkedHashSet<>();

        s1.add("Ramm");
        s1.add("Sham");
        s1.add("Rahul");
        s1.add("Premal");
        s1.add("rohit");
        s1.add("rohit");

        System.out.println(s1);

    }
}
