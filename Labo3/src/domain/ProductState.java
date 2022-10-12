package domain;

public interface ProductState {

    default void rent(Product p) { throw new IllegalArgumentException("Cannot rent item."); }

    default void delete(Product p) { throw new IllegalArgumentException("Cannot delete item."); }

    default void repair(Product p) { throw new IllegalArgumentException("Cannot repair item."); }

    default void bringBack(Product p) { throw new IllegalArgumentException("Cannot bring item back."); }
}
