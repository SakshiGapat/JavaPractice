//find the max and min in array

public class file3 {
    public static void main(String[] args) {
        int[] arr = {10,3,45,26,2};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];

        }
        else if(arr[i]<min){
            min=arr[i];
        }
    }
        System.out.println("Maximun" + max);
        System.out.println("Minimum" + min);
    }
    
}
