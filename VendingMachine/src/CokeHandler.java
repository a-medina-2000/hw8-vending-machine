public class CokeHandler implements SnackDispenseHandler {
    private SnackDispenseHandler nextHandler;

    public void setNextHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void requestFullfilled() {
        System.out.println("Coke selected. ");
    }

    public void outOfStock() {
        System.out.println("Coke is out of stock. Choose another item.");
    }
    public void notEnoughCash() {
        System.out.println("Not enough cash entered.");
    }
}
