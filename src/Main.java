public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Ваш баланс состовляет:");
        bankAccount.deposit(20000.0);
        System.out.println(bankAccount.getAmount());
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Осталось на балансе: " + bankAccount.getAmount());
            } catch (LimitException et) {
                System.out.println(et.getMessage());
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}