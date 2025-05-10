package FacadeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 06:10 pm
 */
public class DVDPlayer {
    public void on() { System.out.println("DVD Player ON"); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
    public void off() { System.out.println("DVD Player OFF"); }
}
