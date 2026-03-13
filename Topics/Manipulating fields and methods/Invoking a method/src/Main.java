import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;import java.lang.reflect.Modifier;

class MethodsDemo {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        Class<?> clazz = someClass.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            method.setAccessible(true);

            try {
                if (Modifier.isStatic(method.getModifiers())) {
                    System.out.println(method.invoke(null));        // static method
                } else {
                    System.out.println(method.invoke(someClass));   // instance method
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//class SomeClass {
//
//    // there is a method
//    public void someMethod() {
//        System.out.println("Hello world!");
//    }
//}