package Pro3.ImageReader;

public class JpgReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader create() {
        return new JpgReader();
    }
}
