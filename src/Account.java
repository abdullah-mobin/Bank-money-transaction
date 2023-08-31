public class Account {
    String accountHolderName = "";
    int accountNumber = 0000;
    double balance = 0.00d;


    Account () {}



    Account (String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance += balance;
    }
     
    Account (String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    void diposit (double balance) {
        if(balance < 0) {
            System.out.println("Sorry wrong input");
        } else {
            this.balance += balance;
            System.out.println("Diposit succesful");
        }
    }


    void withdraw(double balance ) {
        if (balance > this.balance) {
            System.out.println("Invalid balance");
        } else {
            this.balance -= balance;
            System.out.println("Withdrawal success");
        }
    }

}
