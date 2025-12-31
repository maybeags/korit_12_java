package ch10_access_modifier.bank;

public class Bank2 {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank2() {}

    public Bank2(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank2(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank2(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        if(balance < 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;
    }

    public Bank2(int accountNum, String accountHolder, int balance, int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        if(balance < 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    // 자동 완성 이외의 메서드들
    public void deposit(int amount, int inputPin) {

    }

    public void withdraw(int amount, int inputPin) {

    }

    public void showAccountInfo() {
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 : " + balance + "원\n");
    }
}
