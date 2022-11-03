import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;
import java.util.Collections;
// given two arrays that are sorted but neccarly the same length, find the median value.
// For example , if given [[1,5,9],[1,2,3,4,5,6]], return 4, if the number of values is even,
// return avg of the two middle values, return 3.5 ( the median )

// Expand your function to accept three arrays instead of two 

class flattenArray
{

    public static<T> Stream<T> flatten(T[] a, T[] b)
    {
        Stream<T> stream = Stream.of(a, b)
                .flatMap(Arrays::stream);
 
        return stream;
    }
 
    public static void main(String[] args)
    {
        Integer[] a = { 1, 2, 3 };
        Integer[] b = { 4, 5, 6 };
        Integer[] c = { 7 , 9 };
 
        Integer[] z = flatten(a, b)
                        .toArray(Integer[]::new);
        Integer[] s = flatten(z, c)
                        .toArray(Integer[]::new);                
        Arrays.sort(s); 
 
        System.out.println(Arrays.toString(s));    
        System.out.println(s.getClass().getSimpleName()); 
        int n = s.length;
        
        List<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, s);
        System.out.println(list1);

System.out.println(list1.getClass().getSimpleName()); 
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)==list1.get(j)){
                    list1.remove(j);
                }
            }
        }
        System.out.println(list1);
        int num = list1.size();
        if(num%2 == 0){
            
            System.out.println((float)(list1.get(num/2- 1) + list1.get(num/2)) /2);
        }
        else{
            System.out.println(list1.get(num/(int)2));
        }
                 

        

    }
}