package structural.decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        String encryptedData = compress(data);
        stream.write(encryptedData);
    }

    private String compress(String data){
        return data.substring(1,5);
    }
}
