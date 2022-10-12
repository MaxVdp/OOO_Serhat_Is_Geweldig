package domain;

public class Product {
    private StateContext stateContext;
    private boolean damaged = false;

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

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public boolean isDamaged() {
        return this.damaged;
    }
}
