package FacadeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 06:12 pm
 */
public class HomeTheaterFacade {
    DVDPlayer dvdPlayer;
    Projector projector;
    Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    public void playMovie(String movie){
        System.out.println("Started playing movie");
        this.lights.dim();
        this.projector.on();
        this.dvdPlayer.on();
        this.dvdPlayer.play(movie);
    }
    public void endMovie(){
        System.out.println("Started ending movie");
        this.dvdPlayer.off();
        this.projector.off();
        this.lights.on();

    }
}
