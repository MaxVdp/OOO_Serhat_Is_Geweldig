package domain;

public interface ProductState {

    default void rent() { throw new IllegalArgumentException("Cannot rent item."); }

    default void damage() { throw new IllegalArgumentException("Cannot damage item."); }

    default void delete() { throw new IllegalArgumentException("Cannot delete item."); }

    default void repair() { throw new IllegalArgumentException("Cannot repair item."); }

    default void bringBack() { throw new IllegalArgumentException("Cannot bring item back."); }

}
