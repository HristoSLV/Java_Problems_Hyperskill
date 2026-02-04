import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE})
@interface Version {
    String value();
}

@Version("xcvs")
class TestClass {
    public void myMethod() {
        // some code
    }
}