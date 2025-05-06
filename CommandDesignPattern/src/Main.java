/**
 * @ author  ashishKumar
 * @ since 13-04-2024 07:14 pm
 */
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner= new AirConditioner();

        RemoteControl remoteControl= new RemoteControl();
        remoteControl.setCommand(new TurnAcOffCommands(airConditioner));
        remoteControl.executeCommand();
        remoteControl.unDo();
    }
}
