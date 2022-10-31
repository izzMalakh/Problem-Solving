// sorted array without build-in function .sort()
// im gonna use two loops are used to sort the elements. One is for iterating 
//the array until its length, and the second loop is used for checking elements and swapping them.

public class sortedArray{
    public static void main(String[] args){
        int[] arr= { 1,3,51,1,23,214 };

            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int temp=0;
                    // Swapping Elements:
                    if (arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    /////////////////////
                }
            }
            for (int k=0;k<arr.length;k++){
                System.out.print(arr[k] +"  ");
            }
    }
}

// soultion by izzMalakh