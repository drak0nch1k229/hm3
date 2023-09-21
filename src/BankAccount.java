public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount = sum;
    }
    public void withDraw(int sum)throws LimitException{
        if (sum > amount){
            throw new LimitException("Снятие удалось", getAmount());

        }
        this.amount -= sum;
    }
}
