package domain;

import java.time.LocalDate;

public class Auditor implements Observer {
    private Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void update() {
        System.out.println("Nieuwe rekening geopend op " + LocalDate.now() + " met rekeningnummer "
                + this.bank.getAll().pollLast().getRekeningnummer());
    }
}
