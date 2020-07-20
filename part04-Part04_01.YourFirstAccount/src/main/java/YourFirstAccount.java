
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account testBobAccount = new Account("Bob", 100.0);
        
        testBobAccount.deposit(20.0);
        
        System.out.println(testBobAccount);
    }
}
