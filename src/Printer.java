public class Printer extends Account {
    

    Printer () {

    }

    void showBalance (Account tempAccount) {
        System.out.println("Current balance = "+tempAccount.balance);
    }


    void showAccountInfo(Account tempAccount) {
        System.out.println("Account Number : " + tempAccount.accountNumber);
        System.out.println("Name : "+ tempAccount.accountHolderName );
        showBalance(tempAccount);
    }

}
