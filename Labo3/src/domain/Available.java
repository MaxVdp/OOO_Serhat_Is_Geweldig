package domain;

public class Available implements ProductState {
    @Override
    public void rent(Product p) {
        p.getStateContext().setState(new Rented(p));
    }

    @Override
    public void delete(Product p) {
        p.getStateContext().setState(new Deleted());
    }
}
