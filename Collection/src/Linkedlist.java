import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args){

        LinkedList<String> list= new LinkedList<>();
        list.add("Sai");
        list.add("rohit");
        list.add("premal");
        list.add("prasad");
        list.add("rohit");
        list.add("premal");
        list.add("prasad");
        list.add(0,"Rohit");           // add element in particular position


       // System.out.println(list);

        //using for loop
     /*
        for (int i=0;i< list.size();i++){

            System.out.println(list.get(i));
        }

      */

        //using for each loop

     /*   list.forEach(a->{

            System.out.println(a);
        });

      */

        // using iterator


        Iterator itr = list.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }


    }
}
