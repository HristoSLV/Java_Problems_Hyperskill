// Do not remove imports

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        // Add implementation here
        Method method = obj.getClass().getMethod(methodName);
        Type[] typeParameters = method.getTypeParameters();
        System.out.println(typeParameters.length);
    }
}

