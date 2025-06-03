import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

// Extend the class to arraylist because removeRange() is a protected method
public class ArrayStringList extends ArrayList<String> {

public static void main(String[] args) {

    // Create an ArrayList called tasksList, which will be empty for now.
    arrayStringList tasksList = new arrayStringList();

    // Add tasks to the ArrayList
    tasksList.add("banana");
    tasksList.add("mango");
    tasksList.add("graps");
    tasksList.add("star fruite");
    tasksList.add("Staberry");

    // Print the list with the new elements, before removing them.
    System.out.println("Original list: " + tasksList);

    // Remove elements from index 0 to index 3. The first 4 elements.
    tasksList.removeRange(0, 3);

    // Print the list again to see the differences
    System.out.println("List with elements removed: " + tasksList);
    tasksList.add("banana");
    tasksList.add("mango");
    tasksList.add("graps");
    //replace all
   tasksList.replaceAll(String::toLowerCase);
   System.out.println("List with elements upperCase: " + tasksList);
   
   //retainall
   arrayStringList testList2 = new arrayStringList();
   testList2.add("banana");
   testList2.add("rambutton");
   testList2.add("mango");
   tasksList.retainAll(testList2);
   System.out.println("after rettain"+ testList2);
   System.out.println("after rettain"+ tasksList);

   //set update based on index

   String updatedOne = testList2.set(0,"########3");
   System.out.println(updatedOne);
   System.out.println(testList2);

   //size found the list size
   int lenTest = testList2.size();
   System.out.println(lenTest);

    System.out.println(testList2);   

    //split the array list in format using forEachRemaining
    Spliterator<String> split = testList2.spliterator();
    split.forEachRemaining(System.out::println);


    testList2.add("kundhavi");
    testList2.add("Mayavathi");

    testList2.add("bhashvan");

    testList2.add("Sangavi");

    testList2.add("pavithra");

    testList2.add("janani");

    testList2.add("varsha");

    System.out.println(testList2);

    //drop sublit in originallist
    List<String> subList = testList2.subList(3, 7);
    System.out.println(subList);

    //convert list to array

    String[] arrStr = testList2.toArray(new String[0]);
    System.out.println(Arrays.toString(arrStr));

    Arrays.sort(arrStr);

    System.out.println("Sort the String"+ Arrays.toString(arrStr));


    // to trim the needed and used space only as a size 
    
    System.out.println("Before trim the list size:"+ testList2.size());
    testList2.trimToSize();
    System.out.println("After trim the list size:"+ testList2.size());
    ArrayList<String> testList = new ArrayList<>(100); // capacity 100
    testList.add("A");
    testList.add("B");
    
    System.out.println("Size before trim: " + testList.size()); // 2
    testList2.trimToSize(); // capacity shrinks from 100 to 2
    System.out.println("Size after trim: " + testList.size()); // still 2
    


  }
}

