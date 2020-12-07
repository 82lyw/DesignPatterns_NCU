package Pro2.Logger;

public class JavaLanguage implements Language {
    @Override
    public void compile(String SystemType) {
        System.out.println("我支持"+SystemType+"操作系统和" + "Java语言");
    }
}
