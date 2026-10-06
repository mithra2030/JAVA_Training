class Baankaccount{
    public static void main(String args[]){
        account a1 = new account("John", 900, 200);
        a1.display();
        
    }
}
class account{
    String Name;
    int Balance;
    int Deposit;

    account(String Name, int Balance,int Deposit){
        this.Name=Name;
        this.Balance=Balance;
        this.Deposit=Deposit;
    }
    void deposit(){
        Balance=Balance+Deposit
;
    }
    void showbalance(){
        System.out.println("Name: "+Name);
        System.out.println("Balance: "+Balance);

    }
    void display(){
        deposit();
        showbalance();
        if(Balance<500){
            System.out.println("Insufficient funds");
        }
        else{
            System.out.println("Sufficient funds");
        }
    }
    }