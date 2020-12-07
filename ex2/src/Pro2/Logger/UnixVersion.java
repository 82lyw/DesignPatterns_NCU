package Pro2.Logger;

public class UnixVersion extends Logger {

    @Override
    public void writeLog() {
        String systemType = "Unix";
        this.language.compile(systemType);
    }
}
