//creating our own exception
package Exceptionhandling;
public class CreateExc {
    double balance;
    public CreateExc() {
        balance = 5000;
    }
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Enter valid amount. Amount is less than zero.");
        }
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successful. Remaining balance: " + balance);
        } else {
            throw new InsufficientBalanceException("Balance is low in your account.");
        }
    }
    public static void main(String[] args) {
        CreateExc c1 = new CreateExc();
        try {
            c1.withdraw(-200);
            // c1.withdraw(12000);
        }
        catch (InvalidAmountException i) {
            System.out.println(i.getMessage());
        }
        catch (InsufficientBalanceException i) {
            System.out.println(i.getMessage());
        }
    }
}
