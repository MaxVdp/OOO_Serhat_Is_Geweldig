package domain;

public class StateContext {
    private ProductState state;

    public StateContext() {
        this.state = new Available();
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.getClass().getSimpleName();
    }
}
