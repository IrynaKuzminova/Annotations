import java.lang.reflect.Field;
import java.util.List;

public class Main {
    static String path = "File.txt";

    public static void main(String[] args) {

        User user = new User("Iryna", null, 28, null, null);
        List<Field> fields = AnnotationManager.findFieldsWithAnnotation(user);
        FileManager.writerFile(fields);
        FileManager.readerFile();
    }
}
