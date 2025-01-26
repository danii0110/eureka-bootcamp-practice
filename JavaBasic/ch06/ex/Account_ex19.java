package JavaBasic.ch06.ex;

public class Account_ex19 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance< Account_ex19.MIN_BALANCE || balance> Account_ex19.MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }
}
