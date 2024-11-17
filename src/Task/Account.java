package Task;

public class Account {
    String accountNumber;
    int balance;

    Account(String account,int bal)
    {
        this.accountNumber= account;
        if(accountNumber==null || accountNumber.isEmpty())
        {
            System.out.println("account number not-null and not-empty");
        }
        else
        {
            System.out.println(accountNumber);
        }
        this.balance=bal;
        if(balance<=0)
     {
         System.out.println("cannot be negative");
     }
        else {
            System.out.println(balance);
        }
         }

    public static void main(String[] args) {
        Account acc  = new Account("kapil",20);
    }

}
