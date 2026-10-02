package Revision.JavaClasses;

public final class Bank {
    private final int Balance;
    private final int lastWithdrawal;

    public Bank(int Balance, int lastWithdrawal){
        this.Balance = Balance;
        this.lastWithdrawal = lastWithdrawal;
    }

    public int getBalance() {
        return Balance;
    }

    public int getLastWithdrawal() {
        return lastWithdrawal;
    }
}
