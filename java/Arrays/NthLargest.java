import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class NthLargest{
    public static void main(String[] args){
        Integer[] arr ={2,4,5,6,100,200,250,100,4,5,2};
        int Nthelement = 3;
        Arrays.sort(arr);
        // to see elements of the array:
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        ////////////////////////////////

        //to remove repeating elements: 
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, arr);
        System.out.println(list1);
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)==list1.get(j)){
                    list1.remove(j);
                    j--;
                }
            }
        }
         System.out.println(list1);
         ///////////////////////////////

        int l = list1.size();
        // print results: 
        System.out.print("Second largest is : ");
        System.out.println(list1.get(l-2));
        System.out.print("Nth Large element is : ");
        System.out.println(list1.get(l-Nthelement));
        ////////////////////////////////////////////


        
    }
}
// solution by izzMalakh