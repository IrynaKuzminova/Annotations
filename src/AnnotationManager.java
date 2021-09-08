import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnnotationManager {
    public static List<Field> findFieldsWithAnnotation(Object o) {
        List<Field> fieldList = new ArrayList<>();
        Class aClass = o.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            ValidateField validateField = declaredField.getAnnotation(ValidateField.class);
            if (Objects.nonNull(validateField)) {
                try {
                    declaredField.setAccessible(true);
                    Object o1 = declaredField.get(o);
                    checkValidateField(validateField, declaredField, o1);
                    fieldList.add(declaredField);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return fieldList;
    }

    public static void checkValidateField(ValidateField validateField, Field field, Object o1) {
        boolean nullable = validateField.nullable();

        if (!nullable && Objects.isNull(o1)) {
            throw new IllegalArgumentException("Field " + field.getName() + " can`t be null!");
        }
    }
}
