public class Switch {
    public final Command turnOn;
    public final Command turnOff;

    public Switch(Command turnOn, Command turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void executeTurnOn() {
        this.turnOn.execute();
    }

    public void executeTurnOff() {
        this.turnOff.execute();
    }
}
