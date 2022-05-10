import java.util.ArrayList;
import java.util.Iterator;

public class List {

    public static  void main(String []args){

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Sai");
        arr.add("Ram");
        arr.add("Ganesh");
        arr.add("Rohit");
        arr.add("Ganesh");
        arr.add("Rohit");

       // System.out.println(arr);


        // using iterator

      /*  Iterator itr = arr.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }*/



//using for loop
     /*

        for (int i=0;i< arr.size();i++){

            System.out.println(arr.get(i));
        }

      */

        //using for each loop

         arr.forEach(a->{

             System.out.println(a);
         });



        }


    }

