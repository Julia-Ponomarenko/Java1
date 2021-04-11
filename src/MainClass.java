
import org.junit.runners.model.TestClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try {
            start(Test1.class);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = c.getDeclaredMethods();
        List<Method> list = new ArrayList<> ();
        for (Method m : methods) {
            if (m.isAnnotationPresent (Test.class))
            {
                list.add(m);
            }
        }
        list.sort(new Comparator<Method>() {
            @Override
            public int compare(Method m1, Method m2) {
                return m2.getAnnotation(Test.class).priority () - m1.getAnnotation (Test.class).priority ();
            }
        });
        for (Method m: methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                list.add(0, m);
            }
            if (m.isAnnotationPresent(AfterSuite.class)){
                    list.add(m);
            }
        }
        for (Method m: list){
            m.invoke (null);
        }
    }
}

