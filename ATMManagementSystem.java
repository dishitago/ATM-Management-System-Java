import java.util.Scanner;

public class ATMManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=1234;// pre decided pin
        System.out.println("------- ATM LOGIN -------");// login system
        int count=0;
        boolean loginsuccess=false;
        for(int i=0;i<3;i++) {
            System.out.println("Enter PIN: ");
            int pass=sc.nextInt();// user entered pin
            if (pin == pass) {
                loginsuccess=true;
                System.out.println("Login successful.");
                break;
            } else{
                count++;
                System.out.println("Incorrect PIN "+"("+count+"/3"+")");
            }
        }
        if(!loginsuccess){
            System.out.println("Account Blocked");
        }

        int balance=5000; //pre entered balance
        while(loginsuccess) {   //atm menu
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("Enter option:");
            int choice= sc.nextInt(); //user enter the option
            if (choice == 1) {
                System.out.println("Current Balance: " + balance);
            } else if (choice == 2) {
                System.out.println("Enter amount: ");
                int wm = sc.nextInt();  //withdrawal money
                if (wm > 0 && wm <= balance) {
                    balance= balance - wm;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else if (choice == 3) {
                System.out.println("Enter amount:");
                int dm = sc.nextInt();  //deposit money
                balance= balance + dm;
                System.out.println("Deposit Successful");
                System.out.println("New Balance: ₹" + balance);
            } else if (choice == 4) {
                System.out.println("EXIT");
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
