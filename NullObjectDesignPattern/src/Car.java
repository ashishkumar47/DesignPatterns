/**
 * @ author  ashishKumar
 * @ since 23-03-2024 07:11 pm
 */
public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 56;
    }

    @Override
    public int getSeatCapacity() {
        return 40;
    }
}
