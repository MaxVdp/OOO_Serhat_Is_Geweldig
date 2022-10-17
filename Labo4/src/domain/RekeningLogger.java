package domain;

public class RekeningLogger implements Observer {
    private Bank bank;

    public RekeningLogger(Bank b) {
        this.bank = b;
    }

    @Override
    public void update() {
        System.out.println("Totaal aantal rekeningen: " + this.bank.getAmount());
    }
}
