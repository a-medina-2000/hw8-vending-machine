public interface SnackDispenseHandler {
    void requestFullfilled();
    void outOfStock();
    void notEnoughCash();
    void setNextHandler(SnackDispenseHandler nextHandler);
}
