public class BankAccount {
    public double amount;

    public int getAmount() {
        return (int) amount;
    }

    public void deposit(double sum) {
        if (amount == 0) {
            amount = sum;
        } else {
            System.out.println(amount + sum);
        }
    }


    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            System.out.println("Вы сняли с баланса: " + getAmount());
            throw new LimitException("Ошибка. На вашем балансе недостаточно среств. \n" +
                    "Ваш текущий баланс; ", getAmount());
        }
        System.out.println(amount = amount - sum);
    }
}