/**
 * @ author  ashishKumar
 * @ since 13-04-2024 07:09 pm
 */
public class TurnAcOffCommands implements ICommand{

    AirConditioner airConditioner;

    public TurnAcOffCommands(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.turnOffAc();
        System.out.println("ac is turned off");
    }

    @Override
    public void unDo() {
        this.airConditioner.turnOnAc();
        System.out.println("ac is turned on");
    }
}
