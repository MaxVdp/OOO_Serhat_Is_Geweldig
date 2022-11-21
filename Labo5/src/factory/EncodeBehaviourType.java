package factory;

import domain.RandomEncodeAdapter;

public enum EncodeBehaviourType {
    CEASERBEHAVIOUR ("CeaserBehaviour"),
    MIRRORINGBEHAVIOUR ("MirroringBehaviour"),
    RANDOMBEHAVIOUR ("RandomEncodeAdapter");


    private String className;

    EncodeBehaviourType(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getClassPath() {
        return "domain." + getClassName();
    }
}
