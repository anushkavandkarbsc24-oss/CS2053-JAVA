import edu.bank.HomeLoan;
import edu.bank.CarLoan;
import edu.bank.Loan;

public class Main {
    public static void main(String[] args) {
        Loan home = new HomeLoan(500000, 7.5);
        Loan car = new CarLoan(800000, 9.2);

        home.getInterestRate();
        car.getInterestRate();
    }
}
