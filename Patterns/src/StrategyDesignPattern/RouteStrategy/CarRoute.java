package StrategyDesignPattern.RouteStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:46 pm
 */
public class CarRoute implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building fastest car route from " + source + " to " + destination);
    }
}
