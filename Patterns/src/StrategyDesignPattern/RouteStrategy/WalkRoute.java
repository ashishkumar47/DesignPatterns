package StrategyDesignPattern.RouteStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:47 pm
 */
public class WalkRoute implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building fastest walk route from " + source + " to " + destination);
    }
}
