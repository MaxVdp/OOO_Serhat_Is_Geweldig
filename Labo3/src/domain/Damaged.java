package domain;

public class Damaged implements ProductState {
    @Override
    public void delete(Product p) {
        p.getStateContext().setState(new Deleted());
    }
}
