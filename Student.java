public class Student {
    String Name;
    int M1;
    int M2;
    int M3;

    public Student(String Name,int M1,int M2,int M3){
        this.Name = Name;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;

    }
    void avg(){
        float average = (M1+M2+M3)/3;
        System.out.println(average);

            if(average<=90){
                System.out.println("Grade=A");
            }
            else if(average<=80){
                System.out.println("Grade=B");
            }
            else if(average<=70){
                System.out.println("Grade=C");
            }
   
    }
     public static void main(String[]args){
        Student s1 = new Student("Sakshi",90,70,80);
        s1.avg();

        
    }
    
    
}
