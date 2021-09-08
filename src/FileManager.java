import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class FileManager {
    public static boolean createFile() {
        File file = new File(Main.path);
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
    }

    public static void writerFile(List<Field> fieldList) {
        try {
            FileWriter fileWriter = new FileWriter(Main.path);
            for (Field field : fieldList) {
                fileWriter.write(field.getName() + " ");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerFile() {
        try {
            FileReader fileReader = new FileReader(Main.path);
            while (true) {
                int read = fileReader.read();
                if (read == -1) break;
                System.out.print((char) read);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

