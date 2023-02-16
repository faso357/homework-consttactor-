package abstraction;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;

    }
    void calculateInterest(){
        System.out.println("interest is "+(balance*interest)/100);
    }


}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is "+(balance*interest/100)+10);
    }


    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest();
        Visa visa=new Visa(100,10);
        visa.calculateInterest();
        AX ax=new AX(100,10);
        ax.calculateInterest();
    }
    }


