import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(e -> Modifier.isPublic(e.getModifiers()))
                .map(Field::getName)
                .toArray(String[]::new);
    }

//    public String[] getPublicFields(Object object) {
//        // Add implementation here
//        List<String> listOfPublicFields = new ArrayList<>();
//
//        for (var field : object.getClass().getDeclaredFields()) {
//            if (Modifier.isPublic(field.getModifiers())) {
//                listOfPublicFields.add(field.getName());
//            }
//        }
//
//        return listOfPublicFields.toArray(new String[0]);
//    }

}