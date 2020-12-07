package Pro3.AntiVirus;

import java.util.ArrayList;

public class Folder extends Element {
    private ArrayList fileList = new ArrayList();

    public void add(Element element) {
        fileList.add(element);
    }

    public void remove(Element element) {
        fileList.remove(element);
    }

    @Override
    public void killVirus() {
        for (Object object: fileList) {
            ((Element)object).killVirus();
        }
    }
}
