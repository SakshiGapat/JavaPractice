import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:");
    int a = sc.nextInt();
    System.out.println("Enter b:");
    int b = sc.nextInt();

    System.out.println("Enter opr No.");
    int opr = sc.nextInt();
    switch(opr){
        case 1 :System.err.println(a+b);
        break;
        case 2 :System.out.println(a-b);
        break;
        case 3 :System.out.println(a*b);
        break;
        case 4 :System.out.println(a/b);
        break;
        default :System.out.println("invalid input");
    }
    }
    
}
