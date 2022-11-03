
import java.util.Arrays;
// creat a function that, given a string of words (with spaces), returns new string with words in reverse sequence
//given "this is a test" will return "test a is this"
public class ReverseString
{
 
    public static void main(String[] args)
    {
        String[] words = "Life is not a drill , go for it".split(" "); //srting become array 
        
        //show the words after split:
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
            
       
        // }
        /////////////////////////////
        
        String temp = "";
    //see the address before adding to string: cuz the string is immutable in java! cant add to it ! 
System.out.println( "s=" + System.identityHashCode(temp) );
        for (int i = words.length - 1; i >= 0; i--) //reverse for loop at words array
        {
            temp += words[i] + " ";
            
        }
System.out.println( "s1=" + System.identityHashCode(temp) );

        System.out.println("after Reverse:");
        // System.out.println(temp);
        //Bonus: handle punctation and capitalization:

        String cr="";
        String str="";
        String firstLetter=temp.substring(0,1).toUpperCase();
        String remaining=temp.substring(1).toLowerCase();
        cr+= firstLetter.toUpperCase()+remaining;
        System.out.println(cr);
        
        
       
    }
}