package structural.proxy;

public class MainTest {
    public static void main(String[] args) {
        Library library = new Library();

        String[] filenames = {"a", "b", "c"};

        for(String filename: filenames){
            library.add(new EbookProxy(filename));
        }

        library.openEbook("b");
    }
}
