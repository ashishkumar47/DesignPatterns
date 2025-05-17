package StrategyDesignPattern.RouteStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:48 pm
 */
public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void choseStrategy(String origin,String destination){
        if(this.routeStrategy==null){
            System.out.println("choose a strategy");
        }else{
            this.routeStrategy.buildRoute(origin,destination);
        }
    }
}
