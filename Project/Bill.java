package Project;
import java.util.Random;

public class Bill {
    private String bill;
    private CreditCard creditCard;

    public void generateCreditCard() { // Генерируем номер карты
        CreditCard creditCard = new CreditCard(bill);
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        creditCard.setCardnumber(String.format("%06d", number));
        setCreditCard(creditCard);
        this.creditCard = creditCard;

    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
