package Inner.Classes.Inner_non_static;

public class Account {
    private double amount;
    private final String number;
    private final String owner;

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public Account(final String number, final String owner) {
        this.number = number;
        this.owner = owner;
    }

    private synchronized double withdraw(double amountToWithdraw) {
        if (amountToWithdraw > getAmount()) {
            final double amountToReturn = getAmount();
            this.amount = 0;
            return amountToReturn;
        }

        //  if (amountToWithdraw < 0) return .0;

        this.amount = this.amount - amountToWithdraw;
        return amountToWithdraw;
    }


    class Card {
        private String number;

        public String getNumber() {
            return number;
        }

        public double withdraw(double amountToWithdraw) {
            return Account.this.withdraw(amountToWithdraw);
        }
    }
}


class Usage {
    public static void main(String[] args) {
        final Account myAccount = new Account("QW234P", "Rusiashka");
       // myAccount.setAmount(1000000);
        Account.Card rusiashkaCard = myAccount.new Card();
        rusiashkaCard.withdraw(-500);
        System.out.println(myAccount.getAmount());
    }
}