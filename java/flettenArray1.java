// eleminating nested and empty arrays do not alter the array return a new ont retaining the order
// given array [1,[2,3],4,[]] will return --> [1,2,3,4]
import java.util.ArrayList;
import java.util.List;
// the soultion without build-in functions like: Stream , flatten. 

class flettenArray1{
    public static void main(String[] args){
       
ArrayList<Object> Finalarr = new ArrayList<>();
List<ArrayList> list = new ArrayList<>();
      
ArrayList<Integer> array0 = new ArrayList<>();
array0.add(1);
ArrayList<Integer> array1 = new ArrayList<>();
array1.add(2);
array1.add(3);
ArrayList<Integer> array2 = new ArrayList<>();
array2.add(4);
ArrayList<Integer> array3 = new ArrayList<>();
list.add(array0);
list.add(array1);
list.add(array2);
list.add(array3);
        
        
        // System.out.println(list);
        for( ArrayList i : list ){
            // System.out.println(i);
            if(i.size()>0){
                // System.out.println("izz");
                for( Object k : i){
                // System.out.println(k);
                Finalarr.add(k);
            }
            }
            

        }
        System.out.println(Finalarr);


    
}
}
// Solution By Izz Malakh