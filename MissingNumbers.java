//find Missing numners


public class file6 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n=arr.length;

        int a = n*(n+1)/2;
        int sum = 0;

        for(int i = 0; i < n;i++)
        {
            sum += arr[i];        }
            System.out.println(sum-a);

    }
    
}
