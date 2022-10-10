package domain;

public class Product {
    private StateContext stateContext;

    public Product() {}

    public Product(StateContext stateContext) {
        setStateContext(stateContext);
    }

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public StateContext getStateContext() {
        return stateContext;
    }
}
