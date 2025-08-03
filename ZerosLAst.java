//zeros in array should be at last in the array adibe and google
import java.util.Arrays;
import java.util.Scanner;
public class file4 {
    public static void main(String[] args) {
        
        int[] arr = {2,10,0,4,25,0,14,0,3};
        int n = arr.length;
        int index =0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        while(index<n){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
