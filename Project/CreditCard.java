package Project;

public class CreditCard {
    private String bill;
    private String cardnumber;
    public boolean isBlocked = false;
    private int balance = 0;

    public void blockCard() {
        this.bill = null;
        this.cardnumber = null;
        this.balance = 0;
        isBlocked = true;
        System.out.println("Карта заблокирована");
    }

    public CreditCard(String bill) {
        this.bill = bill;
    }
    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
