package creationnal.singleton;

public class MainTest {
    public static void main(String[] args) {
        ConfigManager myConfig = ConfigManager.getInstance();
        myConfig.set("abdou", "today");

        // when we call the getInstance method again it will not change the state
        ConfigManager otherConfig = ConfigManager.getInstance();
        System.out.println(otherConfig.get("abdou")); // will return 'today'
    }
}
