package Pro3.ImageReader;

public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader create() {
        return new GifReader();
    }
}
