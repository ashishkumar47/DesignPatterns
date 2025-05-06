/**
 * @ author  ashishKumar
 * @ since 06-05-2025 11:13 pm
 */
//purpose: Ensure a class has only one instance and provide global access to it.
public class SingletonDesignPattern {
    private static SingletonDesignPattern singletonDesignPattern;
    private SingletonDesignPattern(){

    }
    //synchronized for thread safety
    public static SingletonDesignPattern getInstance() {
        if (singletonDesignPattern == null) { // First check (no locking)
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) { // Second check (with locking)
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern singletonDesignPattern2 = SingletonDesignPattern.getInstance();

        if(singletonDesignPattern1==singletonDesignPattern2)
            System.out.println("These are same objects");

    }
}
