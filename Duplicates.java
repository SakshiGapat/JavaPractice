//find duplicates elements in array tcs

import java.util.Scanner;
public class file5 {
    public static void main(String[] args) {
        
    int[] arr = {1,3,4,2,3,5,3};
    int n = arr.length;
    System.out.println("Duplicates elements is:");
     
    for(int i = 0;i<n;i++)
    {
        for(int j= i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println(arr[i]);
            }
        }
    }
    }
}
