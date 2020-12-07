package Pro2.Logger;

public class LinuxVersion extends Logger {

    @Override
    public void writeLog() {
        String systemType = "Linux";
        this.language.compile(systemType);
    }
}
