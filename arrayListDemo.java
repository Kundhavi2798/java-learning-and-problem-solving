import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayListDemo {

    public static void main(String[] args) {
        System.out.println("Wellcome to java ArrayList");
        ArrayList<Integer> num = new ArrayList<>();
        // add
         num.add(10);
         num.add(10);
         System.out.println(num);
       
         ArrayList<Integer> num2 = new ArrayList<>();
  //addall
  num2.add(20);
  num2.add(30);
  num2.add(40);
  num.addAll(2,num2);
  System.out.println(num);

  //clear
  num.clear();
  System.out.println(num);
  System.out.println("num2"+ num2);


  //clone array
  ArrayList<Integer> clonedarray = (ArrayList<Integer>)num2.clone();
  System.out.println(clonedarray);

  //contains
  boolean isFound = clonedarray.contains(10);
  System.out.println(isFound);

  //foreach : Using forEach with lambda to print each element
  //method 1
  for (Integer num22 : num2) {
    System.out.println(num22);
  }
  //Method2 
  num2.forEach(num22-> System.out.println(num22));

  //get -> get the element based on index
   Integer data = num2.get(0);
   System.out.println("get data "+data);

   //indexof -> found the mentioned element index
   System.out.println(num2.indexOf(40));


   //isempty -> check the array list contains data or not
   System.out.println(num2.isEmpty());
   System.out.println(num.isEmpty());

   /*iterator-> iterate each element when compared to forech it can remove element while iterate
   it has full control of an array*/
   //get an iterator of array
   Iterator<Integer> numbers = num2.iterator();
   //hasNext if there move forward
   //next move the number to next
     while (numbers.hasNext()) {
        Integer nextNum = numbers.next();
        System.out.println("iterator  :  "+nextNum);;
     }


     //ListIterator -> list the all element of an array withour using next declaration

     ListIterator<Integer> listNum = num2.listIterator();
     while (listNum.hasNext()) {
        System.out.println(listNum.next());
     }
  

     // remove -> remove based on index and value of an arrayList
     num2.add(50);
     num.add(data);
     num.add(40);
     System.out.println(num+""+ num2);
     System.out.println(num.remove(0));

     //removeall means remove one subarray in main array
     System.out.println(num2);
     System.out.println(num2.removeAll(num));
     System.out.println(num2);
    }
}