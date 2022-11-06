// important note : StringBuilder class can be used when you want to modify a string without creating a new object.
// creat a function that given a string and array of "naughty words" returns a new string 
// with all naughty words changed to "x" characters example: given:"snap crackle pop ninocompoop",["crack","poop"],
// returns "snap xxxxxle pop ninocomxxxx" , Second Requirments: handle capitalization appropriately 
// Big O-notation o(n^2) try another one ! 
// note : the string in immutable in java cant change so you can use string builder 
public class ReplaceString{  
    public static void main(String args[]){  
    String s1="snap crackle pop ninocompoop";
    String[] arr = {"CRACK","poop"};
    // System.out.println(arr[1].getClass().getSimpleName());
    String s="";
    s1 = s1.toLowerCase();
    for(int i=0;i<arr.length;i++){
        arr[i] = arr[i].toLowerCase();
        if(s1.contains(arr[i])){
            String temp ="";
            for(int k=0;k<arr[i].length();k++){
                temp+= "x";
            }
            s = s1.replace(arr[i],temp);
            s1 = s;
        }
        
            
    } 
    System.out.println(s);
}
}  

// in python : for i in arr --> str = str.replace(i,"x"*len(i)) :D 


// by izzMalakh