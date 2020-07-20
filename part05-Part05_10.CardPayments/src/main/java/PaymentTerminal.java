
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money

        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = payment;

        if (payment >= 2.50) {

            affordableMeals += 1;

            this.money += 2.50;

            change = change - 2.50;

        }

        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = payment;

        if (payment >= 4.30) {

            heartyMeals += 1;

            this.money += 4.30;

            change = change - 4.30;

        }

        return change;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {

        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= 2.50) {
            affordableMeals += 1;
            return card.takeMoney(2.50);

        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {

        if (card.balance() >= 4.30) {
            heartyMeals += 1;
            return card.takeMoney(4.30);

        }

        return false;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
