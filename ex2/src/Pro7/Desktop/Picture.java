package Pro7.Desktop;

public class Picture implements AbstractApp {
    private Application app = new Application();

    @Override
    public void run() {
        System.out.println("Kick window picture!");
        app.run();
    }
}
