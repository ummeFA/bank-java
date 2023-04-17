public class Main{
    public static void main(String[]args){
        Account pumba= new Account("Pumba");
        Account timon= new Account("Timon");

        pumba.depositAmount(1000.0);
        pumba.withdrawAmount(100.0);
        timon.depositAmount(600.0);
        pumba.transferAmount(200, timon);
        
    }
}