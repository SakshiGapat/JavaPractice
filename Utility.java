//create utility class with static method to validate even no

class Utility {
    int num;

   static boolean validate(int num){
    return num % 2 == 0;

   }
}

 class Main {
     public static void main(String[] args) {
        int num = 12;
        if(Utility.validate(num)){
            System.out.println(num + "is an even number");
        }
            else{
                System.out.println(num + "is an odd number");
            }
        
     }

}
