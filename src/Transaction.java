

public class Transaction extends Account{
    
    Printer pr = new Printer();

    Transaction () {}

    void transaction (Account sender, Account receiver, double ammount) {
        if (ammount > sender.balance)  {
            System.out.println("Sorry!! invalid balance");
        } else {
            sender.balance -= ammount;
            receiver.balance += ammount;
            System.out.println("Successfuly transfared");
            

            pr.showAccountInfo(sender);
            pr.showAccountInfo(receiver);
        }
    }

}
