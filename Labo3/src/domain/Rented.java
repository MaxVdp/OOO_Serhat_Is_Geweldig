package domain;

public class Rented implements ProductState {
    @Override
    public void bringBack(Product p) {
        if (p.isDamaged()) {
            p.getStateContext().setState(new Damaged());
        } else {
            p.getStateContext().setState(new Available());
        }
    }
}
