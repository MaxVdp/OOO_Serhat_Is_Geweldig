package domain;

public class Rented implements ProductState {
    public Rented(Product p) {
        System.out.println(p.getName() + " is uitgeleend voor €" + p.getUitleenPrijs());
    }

    @Override
    public void bringBack(Product p) {
        if (p.isDamaged()) {
            p.getStateContext().setState(new Damaged());
            System.out.println(p.getName() + " is beschadigd teruggebracht... Extra kost van €" + p.getHerstelPrijs());
        } else {
            p.getStateContext().setState(new Available());
        }
    }
}
