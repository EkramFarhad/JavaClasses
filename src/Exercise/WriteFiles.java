package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteFiles {
    public static void main(String[] args) throws IOException {

        String path = "Files/EkramPractice1.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();
        properties.setProperty("FatherName", " Mohammad Alam");
        properties.setProperty("age", "70");
        properties.setProperty("Last name"," gulmoomad");

        properties.store(fileOutputStream, " New files added");
    }
}
