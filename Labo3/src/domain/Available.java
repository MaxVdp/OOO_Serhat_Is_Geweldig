package domain;

public class Available implements ProductState {
    @Override
    public void rent(Product p) {
        p.getStateContext().setState(new Rented());
    }
}
