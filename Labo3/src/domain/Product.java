package domain;

public class Product {
    private String name;
    private StateContext stateContext;
    private boolean damaged = false;
    private double aankoopPrijs;

    public Product(String name, double aankoopPrijs) {
        this(name, aankoopPrijs, new StateContext());
    }

    public Product(String name, double aankoopPrijs, StateContext stateContext) {
        this.name = name;
        this.aankoopPrijs = aankoopPrijs;
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

    public String getName() {
        return name;
    }

    public double getAankoopPrijs() {
        return aankoopPrijs;
    }

    public double getUitleenPrijs() {
        return aankoopPrijs / 5;
    }

    public double getHerstelPrijs() {
        return aankoopPrijs / 3;
    }
}
