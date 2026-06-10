package day6;

public class ATMDetails {
    String card_type="debit";
    private static int pin=2345;
    int card_no=123456;
    int amount=5000;
    public void setPin(int newpin){
        this.pin=newpin;
        System.out.println("Pin changed successfull");
    }
    public int getPin(){
        return this.pin;
    }
    public class  ATM{
        public static void main(String args[]){
            ATMDetails sbi = new ATMDetails();
            System.out.println(sbi.getPin());
            sbi.setPin(1010);
            System.out.println(sbi.getPin());

        }
    }
    
}








