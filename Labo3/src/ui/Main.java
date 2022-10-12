package ui;

import domain.Product;
import domain.StateContext;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Boek", 3.00);

        System.out.println(p);
        p.getStateContext().getState().rent(p);

        //Dit gooit een exception want je kan het niet nog eens uitlenen (rent methode is niet geimplementeerd in de Rented state)
        //p.getStateContext().getState().rent(p);

        p.setDamaged(true);
        p.getStateContext().getState().bringBack(p);

        p.getStateContext().getState().repair(p);

        p.getStateContext().getState().rent(p);

        p.setDamaged(true);
        p.getStateContext().getState().bringBack(p);

        p.getStateContext().getState().delete(p);

    }
}
