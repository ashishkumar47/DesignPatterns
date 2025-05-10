package FacadeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 06:40 pm
 */
public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(CPU cpu, HardDrive hardDrive, Memory memory) {
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public void on(){
        System.out.println("starting computer");
        this.cpu.freeze();
        String data = this.hardDrive.read(100L,1024);
        this.memory.load(20L,data);
        this.cpu.execute();
    }
    public void shutDown(){
        System.out.println("Shutting down computer...");
        System.out.println("Saving all data...");
        System.out.println("Flushing memory...");
        System.out.println("Turning off CPU...");
        System.out.println("Computer is off.");
    }
}
