public class Account {
    private String name = "";
    private double balance = 0.0;
    public Account(String name){
        this.name = name;
    }

    // Deposit
    public void depositAmount(double amount){
        balance+= amount;
        System.out.println(name+"'s balance is: "+balance);
    }
    
    // Withdraw
    public void withdrawAmount(double amount){
        if(amount>balance){
            System.out.println("Balance is not sufficient.");
        }else{
            balance-= amount;
            System.out.println(this.name+"'s balance after withdrawn is: "+balance);
        }
    }

    // Transfer
    public void transferAmount(double amount, Account account){
        if(amount> this.balance){
            System.out.println("Transfer amount is greater than current balance.");
        }else{
            this.balance-= amount;
            account.balance+=amount;

            System.out.println(this.name+"'s current balance after transfer is: "+this.balance);
            System.out.println(account.name+"'s current balance after transfer is: "+account.balance);
        }
    }
}
