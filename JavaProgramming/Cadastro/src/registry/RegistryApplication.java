package registry;

import java.io.File;
import java.io.IOException;

public class RegistryApplication {
    public static void main(String[] args) throws IOException {
        Greeting.printGreeting();
        String path = "src/file.txt";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();

        System.out.println(absolutePath);
        ReadRec.reader(absolutePath);
        OptionsMenu.choseOption();
    }
}