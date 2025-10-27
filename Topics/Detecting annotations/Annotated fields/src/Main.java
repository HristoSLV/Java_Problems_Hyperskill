import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        Field[] fields = object.getClass().getDeclaredFields();

        List<String> result = new ArrayList<>();

        for (Field field : fields) {
            if (field.getDeclaredAnnotations().length > 0) {
                result.add(field.getName());
            }
        }
        return result.toArray(String[]::new);
    }

}