package Class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "Files/test2.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();

        properties.setProperty("Name", " Ekram");
        properties.setProperty("LastName", "Farhad");
        properties.setProperty("NickName", "I don't know");

        properties.store(fileOutputStream, "New naming has been added");

    }
}
