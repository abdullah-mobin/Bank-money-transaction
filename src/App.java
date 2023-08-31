public class App {
    public static void main(String[] args) throws Exception {
       
        // creating multiple accounts to test
        Account mahi = new Account("Mahi",1565,10000);
        Account nafis = new Account("Nafis",1899,15000);
        
        // creating helper objects
        Printer pr = new Printer();
        Transaction tr = new Transaction();


        // testing
        tr.transaction(mahi, nafis, 5000);
    }
}
