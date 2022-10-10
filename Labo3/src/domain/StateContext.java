package domain;

public class StateContext {
    private ProductState state;

    public StateContext() {}

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }
}
