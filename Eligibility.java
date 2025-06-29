//check the elegibility for scholorship based marks and income
public class Eligibility
 {
   String name;
   int marks;
   int income;
   
   Eligibility(String name,int marks,int income){
    this.name=name;
    this.marks=marks;
    this.income=income;

   }
   void scholorship(){
    if(marks<=75){
        System.out.println("Eligible");
    }
    else if(income<=250000){
        System.out.println("Eligible");
    }
    else{
        System.out.println("Not Eligible");
    }
   }
   public static void main(String[] args) {
    Eligibility e1 = new Eligibility("Sakshi", 60
    , 100000);
    e1.scholorship();
   }
}
