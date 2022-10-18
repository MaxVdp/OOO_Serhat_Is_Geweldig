package domain;

import java.util.Objects;

public class Rekening implements Comparable {
    private String rekeningnummer;
    private double saldo;

    public Rekening(String rekeningnummer, double saldo) {
        this.setRekeningnummer(rekeningnummer);
        this.setSaldo(saldo);
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rekening)) return false;
        Rekening rekening = (Rekening) o;
        return rekening.rekeningnummer.equals(this.rekeningnummer);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Rekening)) {
            return -1;
        }
        return rekeningnummer.compareTo(((Rekening) o).getRekeningnummer());
    }
}
