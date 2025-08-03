import java.util.Scanner;

class ATM{
    float  Balance;
    int PIN = 6080;
    public void checkpin(){
        System.out.print("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN){
            menu();
        }else {
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("Thankyou for comming , have a good day");
            return;
        }else {
            System.out.println("Enter a  valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
         float amount = sc.nextInt();
         if (amount > Balance ){
             System.out.println("Insufficient Balance");
         }else {
             Balance = Balance - amount;
             System.out.println("Money Withdrawl Successful");
         }
         menu();
    }
    public void depositMoney(){
        System.out.print("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class Main {
   public static void main(String[] args){
   ATM obj = new ATM();
   obj.checkpin();
   }
}