package Pro2.Logger;

public class Client {
    public static void main(String args[]) {
        Language language;
        Logger logger;

        language = new PythonLanguage();
        logger = new LinuxVersion();
        logger.setLanguage(language);
        logger.writeLog();
    }
}
