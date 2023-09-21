
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(15000);


        while (true){
            try {
                account.withDraw(6000);
            }
            catch (LimitException e){
                try {
                    account.withDraw((int)e.getRemainingAmount());

                }
                catch (LimitException a){
                    System.out.println(a.getMessage());

                }

            }
            System.out.println(account.getAmount());
            if (account.getAmount()==0){
                break;
            }
        }
    }
}
