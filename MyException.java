package day7;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String msg){
        super(msg);
    }
}
class BankExample{
    String name;
    int inbal;
    public BankExample(String name,int inbal){
        this.name=name;
        this.inbal=inbal;
    }
    public void withdraw(int amount)throws InsufficientFundsException{
        if(amount>inbal){
            throw new InsufficientFundsException("not having enough balance");
        }
        else{
            System.out.println("Withdraw successfully");
            inbal-=amount;
            System.out.println("balance is:"+inbal);
        }
    }
}
public class MyException {
    public static void main(String[] args) {
        BankExample obj=new BankExample("jaanu",5000);
        try{
            obj.withdraw(2000);
        }
        catch(InsufficientFundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Thankyou visit again");
        }
    }
    
    
}
