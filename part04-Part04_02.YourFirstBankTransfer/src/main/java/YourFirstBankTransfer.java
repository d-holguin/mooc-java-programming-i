
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account mattAccount = new Account("Matthews account", 1000.00);
        
        Account myAccount = new Account("My account", 0);
        
        mattAccount.withdrawal(100);
        
        myAccount.deposit(100);
        
        System.out.print(mattAccount + " \n " + myAccount);
        
        
    }
}
