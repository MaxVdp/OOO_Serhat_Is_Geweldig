package ui;

import domain.Product;
import domain.StateContext;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Boek");

        System.out.println(p);
        p.getStateContext().getState().rent(p);
        System.out.println(p);

        //Dit gooit een exception want je kan het niet nog eens uitlenen (rent methode is niet geimplementeerd in de Rented state)
        //p.getStateContext().getState().rent(p);

        p.setDamaged(true);
        p.getStateContext().getState().bringBack(p);
        System.out.println(p);

        p.getStateContext().getState().repair(p);
        System.out.println(p);

        p.getStateContext().getState().rent(p);
        System.out.println(p);

        p.setDamaged(true);
        p.getStateContext().getState().bringBack(p);
        System.out.println(p);

        p.getStateContext().getState().delete(p);
        System.out.println(p);

    }
}
