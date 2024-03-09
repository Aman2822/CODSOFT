import java.util.Scanner;

public class Atm {
    private static class Account{
        private int balance;

        public  Account(int initialbalance){
            this.balance = initialbalance;
        }

        public void deposit(int amount){
            if(amount>0){
                balance +=amount;
                System.out.println("Current Balance" + balance);
            }else{
                System.out.println("Invalid amount");
            }
        }

        public void withdraw(int amount){
            if(amount > 0 && amount < balance ){
                balance -= amount;
                System.out.println("The remaining balance" + balance );
            }
            else if(amount >=balance){
                System.out.println("Insufficient balance");
            }
            else{
                System.out.println("Invalid amount");
            }
        }
        public int getbalance(){
            return balance;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(500);
        String ans = "y";
        while(ans.equalsIgnoreCase("y")){
            System.out.println("Enter 'd' to deposit the money or 'w' to withdraw the money or 'b' to checkbalance of the account");
            String option = sc.next();     
            if(option.equalsIgnoreCase("d")){
                System.out.println("Enter amount to deposit into the account");
                int amount = sc.nextInt();
                account.deposit(amount);
            }  
            else if(option.equalsIgnoreCase("w")){
                System.out.println("Enter amount to withdraw: ");
                int amount = sc.nextInt();
                account.withdraw(amount);
            }
            else if(option.equalsIgnoreCase("b")){
                System.out.println("Current Balance:" + account.getbalance());
            }
            else{
                System.out.println("Invalid option");
            }
            System.out.println("Do you have any other queries....");
            ans = sc.next();
            if(!ans.equalsIgnoreCase("y")){
                System.out.println("Thanks for using Atm");
                break;
            }
         }
    }
    
}
