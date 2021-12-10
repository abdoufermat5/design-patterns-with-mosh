package structural.decorator;

public class MainTest {
    public static void main(String[] args) {
        storedCreditCard(new CompressedCloudStream(new CloudStream()));
    }

    public static void storedCreditCard(Stream stream){
        stream.write("1234-9995-2006-1235");
    }
}
