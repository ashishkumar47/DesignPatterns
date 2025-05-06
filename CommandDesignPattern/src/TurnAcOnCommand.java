/**
 * @ author  ashishKumar
 * @ since 13-04-2024 07:08 pm
 */
public class TurnAcOnCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.turnOnAc();
        System.out.println("ac is turned on");
    }

    @Override
    public void unDo() {
        this.airConditioner.turnOffAc();
        System.out.println("ac is turned off");
    }
}
