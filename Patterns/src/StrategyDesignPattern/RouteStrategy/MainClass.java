package StrategyDesignPattern.RouteStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:44 pm
 */
public class MainClass {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new BikeRoute());
        navigator.choseStrategy("delhi","bombay");

        Navigator navigator1 = new Navigator(new CarRoute());
        navigator1.choseStrategy("delhi","bombay");

        Navigator navigator2 = new Navigator(new WalkRoute());
        navigator2.choseStrategy("delhi","bombay");
    }
}
