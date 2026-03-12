import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class ReflectionUtils {

    public static int countPublicMethods(Class<?> targetClass) {
        return Arrays.stream(targetClass.getDeclaredMethods())
                .filter(e -> Modifier.isPublic(e.getModifiers()))
                .toArray().length;
    }

}