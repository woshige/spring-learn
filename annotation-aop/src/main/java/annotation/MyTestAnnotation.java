package annotation;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyTestAnnotation {
    static Logger logger = Logger.getLogger(MyTestAnnotation.class.getName());

    @MyAnnotation(name = "hello", id = 1111)
    public void hello() {

    }

    public static void main(String[] args) {
        Method[] methods = MyTestAnnotation.class.getMethods();
        for (Method method : methods) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                logger.log(Level.INFO, annotation.name() + annotation.id());
            }
        }
    }
}
