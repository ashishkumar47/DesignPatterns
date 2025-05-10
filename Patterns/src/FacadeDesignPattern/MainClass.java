package FacadeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 06:10 pm
 */
public class MainClass {
    public static void main(String[] args) {
//        DVDPlayer dvdPlayer= new DVDPlayer();
//        Lights lights= new Lights();
//        Projector projector = new Projector();
//
//        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer,projector,lights);
//        homeTheaterFacade.playMovie("WALL-E");
//        homeTheaterFacade.endMovie();

        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        ComputerFacade computerFacade = new ComputerFacade(cpu,hardDrive,memory);
        computerFacade.on();
        computerFacade.shutDown();
    }
}
