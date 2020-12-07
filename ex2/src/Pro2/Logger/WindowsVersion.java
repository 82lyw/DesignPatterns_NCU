package Pro2.Logger;

public class WindowsVersion extends Logger {

    @Override
    public void writeLog() {
        String systemType = "Windows";
        this.language.compile(systemType);
    }
}
