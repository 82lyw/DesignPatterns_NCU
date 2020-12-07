package Pro2.Logger;

public class PythonLanguage implements Language {
    @Override
    public void compile(String systemType) {
        System.out.println("我支持"+systemType+"操作系统和" + "Python语言");
    }
}
