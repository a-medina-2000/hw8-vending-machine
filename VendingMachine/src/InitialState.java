public class InitialState implements StateOfVendingMachine {
    @Override
    public void request() {
        System.out.println("Waiting State. Choose a snack.");
    }
}

class SelectState implements StateOfVendingMachine {
    @Override
    public void request() {
        System.out.println("Snack Chosen. Enter payment.");
    }
}

class PayState implements StateOfVendingMachine {
    @Override
    public void request() {
        System.out.println("Payment entered. Dropping snack...");
    }
}

class EmptyState implements StateOfVendingMachine {
    @Override
    public void request() {
        System.out.println("Snack is out of stock. Choose another snack.");
    }
}
