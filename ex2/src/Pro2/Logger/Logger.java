package Pro2.Logger;

public abstract class Logger {
    protected Language language;

    public void setLanguage(Language language){
        this.language = language;
    }

    public abstract void writeLog();
}
