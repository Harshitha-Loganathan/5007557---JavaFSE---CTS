public class CommandDriver {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // The light is on.

        remote.setCommand(lightOff);
        remote.pressButton(); // The light is off.
    }
}
