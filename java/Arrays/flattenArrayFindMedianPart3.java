import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;
import java.util.Collections;
// given two arrays that are sorted but neccarly the same length, find the median value.
// For example , if given [[1,5,9],[1,2,3,4,5,6]], return 4, if the number of values is even,
// return avg of the two middle values, return 3.5 ( the median )


// Rework function to correctly handle an arbitrary number of arrays.(multiple arrays) 

class flattenArrayFindMedianPart3
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
        Integer[] b = { 4, 5, 9 };
        Integer[] c = { 7  };
        Integer[] d = { 8 };
        Integer[] e = { 10 };
        Integer[] f = { 2 ,14 };
        ArrayList<Integer[]> finalarr = new ArrayList<Integer[]>();
        finalarr.add(a);
        finalarr.add(b);
        finalarr.add(c);
        finalarr.add(d);
        finalarr.add(e);
        finalarr.add(f);
        // for( Integer[] abd: finalarr){
        //     for (Integer izz: abd){
        //         System.out.print(izz +" ");
        //     }
            
        // }
        // System.out.println(" ");

        Integer[] s ={};
        for( Integer[] x : finalarr){
            
             s = flatten( x, s)
                        .toArray(Integer[]::new);
        }
                    
        Arrays.sort(s); 

        // System.out.println(s);    
        // System.out.println(s.getClass().getSimpleName()); 
        int n = s.length;
        
        List<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, s);
        System.out.println(list1);

System.out.println(list1.getClass().getSimpleName()); 
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)==list1.get(j)){
                    list1.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list1);
        int num = list1.size();
        if(num%2 == 0){
            
            System.out.println("the median is: " + (float)(list1.get(num/2- 1) + list1.get(num/2)) /2);
        }
        else{
            System.out.println("the median is: " + list1.get(num/(int)2));
        }
                 

        

    }
}
// solution by izz and abdalfatah