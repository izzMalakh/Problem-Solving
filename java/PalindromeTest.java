
import java.util.*;
public class PalindromeTest { 
    
    public static void main(String[] args){

        String text = "aaaaaaaaaaaaaaaaa";
        char[] arr = text.toCharArray();
        String str = "";

        for(int i =arr.length -1 ;i>=0;i--){
            str = str+ arr[i];
        }
        // check if the string is Palindrome! if yes return true ! 
        if(str.equals(text)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        }

}