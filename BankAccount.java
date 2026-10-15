import java.util.Scanner;
class BankAccount{
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;
    BankAccount(String name, long accNo, String type, double balance){
        this.accountHolderName=name;
        this.accountNumber=accNo;
        this.accountType=type;
        this.accountBalance=balance;
    }
    void display(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: "+accountBalance); 
    }
    void deposit(double amount){
        accountBalance=accountBalance+amount;
        System.out.println("Amount Deposited: "+amount);
    }
    void withdrawn(double amount){
        if (amount<=0){
            System.out.println("Invalid amount");
        }
        else if (amount<=accountBalance){
            accountBalance=accountBalance-amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient Balance.");
        }
    }
    void balanceEnquiry(){
        System.out.println("Account Balance is as follows: "+accountBalance);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter an account Number: ");
        int acc=sc.nextInt();
        System.out.println("Account type needed: (Savings/Current)");
        String acctype=sc.next();
        BankAccount bank = new BankAccount(name, acc, acctype, 0);
        System.out.println("Account Successfully opened! You can now use your account.");
        bank.display();
        bank.deposit(2000);
        bank.withdrawn(1000);
        bank.balanceEnquiry();
    }
}

