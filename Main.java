import java.util.Scanner;

class Payment {
    void makePayment(double amount) {
        System.out.println("Amount = " + amount);
    }

    void makePayment(double amount, String transactionId) {
        System.out.println("Payment Amount = " + amount);
        System.out.println("Transaction Id = " + transactionId);
    }
}

class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Credit Card Payment");
        super.makePayment(amount);
    }
}

class UpiPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("UPI Payment");
        super.makePayment(amount);
    }
}

class NetBankingPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Net Banking Payment");
        super.makePayment(amount);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Credit Card amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter Payment amount: ");
        double pa = input.nextDouble();

        System.out.print("Enter Transaction ID: ");
        String str = input.next();

        System.out.print("Enter UPI amount: ");
        double upi = input.nextDouble();

        System.out.print("Enter NetBanking amount: ");
        double nb = input.nextDouble();

        Payment p = new CreditCardPayment();
        if (amount > 0) {
            p.makePayment(amount);
        } else {
            System.out.println("Invalid");
        }

        p.makePayment(pa, str);

        Payment p1 = new UpiPayment();
        if (upi > 0) {
            p1.makePayment(upi);
        } else {
            System.out.println("Invalid");
        }

        Payment p2 = new NetBankingPayment();
        if (nb > 0) {
            p2.makePayment(nb);
        } else {
            System.out.println("Invalid");
        }
        input.close();
    }
}


