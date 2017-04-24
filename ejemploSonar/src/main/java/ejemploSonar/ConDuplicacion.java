package ejemploSonar;
 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
 
 
 public class ConDuplicacion {
     public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList(); 
        LinkedList<Integer> lList = new LinkedList(); 
        for(int i = 0; i < 10000; i++){
            aList.add(i);
            lList.add(i);
        }
        long startArray = System.nanoTime();
        aList.add(0, 34);
        long finishArray = System.nanoTime() - startArray;
        long startLinked = System.nanoTime();
        ListIterator<Integer> ll = lList.listIterator();
        ll.add(34);
        long finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("1: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("1: LinkedList");
        }
        startArray = System.nanoTime();
        aList.add(4999, 1);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(4999);
        ll.add(1);
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("2: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("2: LinkedList");
        }
        startArray = System.nanoTime();
        aList.add(9999, 1);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(9999);
        ll.add(1);
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("3: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("3: LinkedList");
        }
        startArray = System.nanoTime();
        aList.remove(0);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator();
        ll.next();
        ll.remove();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("4: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("4: LinkedList");
        }
        startArray = System.nanoTime();
        aList.remove(4999);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(4999);
        ll.next();
        ll.remove();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("5: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("5: LinkedList");
        }
        startArray = System.nanoTime();
        aList.remove(9999);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(9999);
        ll.previous();
        ll.remove();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("6: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("6: LinkedList");
        }
        startArray = System.currentTimeMillis();
        aList.get(0);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator();
        ll.next();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("7: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("7: LinkedList");
        }
        startArray = System.currentTimeMillis();
        aList.get(4999);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(4999);
        ll.next();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("8: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("8: LinkedList");
        }
        startArray = System.currentTimeMillis();
        aList.get(9999);
        finishArray = System.nanoTime() - startArray;
        startLinked = System.nanoTime();
        ll = lList.listIterator(9999);
        ll.previous();
        finishLinked = System.nanoTime() - startLinked;
        if (finishArray>finishLinked){
             System.out.println("9: ArrayList");
        }
        else if (finishArray<finishLinked){
             System.out.println("9: LinkedList");
        }
    }
}