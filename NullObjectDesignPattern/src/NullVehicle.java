/**
 * @ author  ashishKumar
 * @ since 23-03-2024 07:11 pm
 */
public class NullVehicle implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
