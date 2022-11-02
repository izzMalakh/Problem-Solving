import java.util.ArrayList;
// big-o notation is o(n^2): 
// try another solution without double for loop for optimize solution (part2)
// determine how many times occurs in the list of input string.
class sparseArray{
     public static void main(String[] args){
        String[] input = {"ab" , "ab", "abc"};
        String[] queries ={"ab", "abc","bc"};
        ArrayList<Integer> arr = new ArrayList<>();
        int count=0;
        for(int i=0;i<queries.length;i++) {
            
            for(int j=0;j<input.length;j++) {
                if(queries[i]==input[j]){
                    count++;
                }
            }
            arr.add(count);
            count =0;
        
     }
     System.out.println(arr);
}
}
// Solution by izzMalakh