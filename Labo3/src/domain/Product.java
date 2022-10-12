package domain;

public class Product {
    private String name;
    private StateContext stateContext;
    private boolean damaged = false;

    public Product(String name) {
        this(name, new StateContext());
    }

    public Product(String name, StateContext stateContext) {
        this.name = name;
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

    @Override
    public String toString() {
        return name + ": " + stateContext;
    }
}
