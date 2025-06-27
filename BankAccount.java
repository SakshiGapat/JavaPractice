public class BankAccount {
    int AccNo;
    String AccHolderName;
    double deposit;
    double withdrawal;


    BankAccount(int AccNo,String AccHolderName,double deposit,double withdrawal){
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.deposit = 50000;
        this.withdrawal = withdrawal;
    }
    //void deposit()
    //{
      //  double deposit = 50000;
    //}
    void withdrawal(){
        if(withdrawal>deposit){
            System.out.println("Overdrafting");
        }
        else{
            System.out.println("Successfully Withdraw money");
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1234,"Sakshi" , 50000, 50);
        b1.withdrawal();
    }
    
}
