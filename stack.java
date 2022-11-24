//counting starts from 1 and not from zero and counting starts from right end and no the left end
//                      [5,6,7,8,9]
//counting will be like  5 4 3 2 1
import java.util.Iterator;
import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> s1= new Stack<>();
        s1.push(6); //adds elements
        s1.push(8);
        s1.push(3);
        s1.push(7); //adds elements
        s1.push(9);
        s1.push(5);
        System.out.println(s1); //ans [6,8,3] pehle 6 add hoga phir 8 phir 3

        s1.pop(); // pops out the last inputted item here 3
        System.out.println(s1);

        System.out.println(s1.peek()); // prints the item at the top or last

        System.out.println(s1.empty());  // shows if the stack is empty ture if it is empty false if it not empty
        boolean b=s1.empty();  // boolean mein isiliye store kiye kyunki either its true or its false
        System.out.println(b+" aise v check kr skte hai");
                        // SEARCHING
        System.out.println(s1.search(5)); // agaar koi element na ho to -1 return hoga
        System.out.println(s1.search(8)); // counting starts from 1 and not from zero
                                            // and counting starts from right end and no the left end
        System.out.println(s1.search(6));
                // ITERATION ON STACKS
        Iterator<Integer> it= s1.iterator();
        while(it.hasNext()){
            Object s2= it.next();
            System.out.print(s2+" ");
        }
        System.out.println();
        System.out.println("the sixe of the stck is "+s1.size());




    }

}
