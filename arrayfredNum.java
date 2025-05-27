import java.util.*;
public class arrayfredNum {

    public static void main(String[] args) {
        int[] num = {1,3,5,3,3,3,4,4,4,6,6,5};
        System.out.println(Arrays.toString(num));
        String[] arr = new String[5];
        arr[0]="one"; 
        arr[1]="two";
        arr[2]="Three"; 
        arr[3]="Four";
        arr[4]="five";
        System.out.println(Arrays.toString(arr));

        //fill-> to fill the values based on start and end index

        Arrays.fill(arr, 1,4,"Zero");
        System.out.println(Arrays.toString(arr));

        int len = arr.length;
        System.out.println(len);
        

        for (int i = 0;i<arr.length;i++){
           System.out.println(arr[i]);
        }

        int[][] twoD = {
            {1,2,3,4,5},
            {6,7,8,90,10},
            {2,43,5,6,87},
        };
        for (int[] col : twoD){
            Arrays.sort(col);

        }
        System.out.println(Arrays.deepToString(twoD));
    }
}