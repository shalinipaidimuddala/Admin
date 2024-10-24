class ATM {
    public void withdrawMoney() {
        // Code to withdraw money
    }

    public void checkBalance() {
        // Code to check balance
    }
}

public class CohesionExample {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdrawMoney();
        atm.checkBalance();
    }
}