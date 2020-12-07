package Pro5.Computer;

import sun.applet.Main;

import java.util.Random;

public class MainFrame {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public MainFrame() {
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }

    public void on() {
        int r = new Random().nextInt();

        if(r % 2 == 0) {
            memory.check();
            cpu.run();
            hardDisk.read();
            os.load();
        }
        else {
            System.out.println("Start fail!");
        }
    }
}
