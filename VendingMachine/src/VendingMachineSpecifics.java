public class VendingMachineSpecifics {
    private StateOfVendingMachine state;

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void request() {
        state.request();
    }
}
