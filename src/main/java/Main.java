public class Main {
    public static void main(String args[]) {
        Lamp lamp = new Lamp();
        Command turnOffLamp = lamp::turnOff;
        Command turnOnLamp = lamp::turnOn;
        Switch commandSwitch = new Switch(turnOnLamp, turnOffLamp);
        commandSwitch.executeTurnOff();
    }
}