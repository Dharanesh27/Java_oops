class BankAccount{
    String accnum;
    double balance;
    BankAccount(String accnum,double balance){
        if(balance < 0){
            System.out.println("Invalid input,Setting balance to 0.");
            this.balance = 0;
        }
        else{
           this.balance =balance;
        }
        this.accnum=accnum;
    }
    void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount of " + amount + " deposited successfully");
    }
    void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient balance.");
        }
        else{
            this.balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        }
        System.out.println("Current balance: " + this.balance);
    }
    void displaybalance(){
        System.out.println(this.balance);
    }
 
}
class Main{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456",2000);
        acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.displaybalance();
    }
}