package Others.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// interceptor to register call the method before the method doing a any thing
public class Interceptor  implements InvocationHandler {

    private Object object;

    public Interceptor(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + "() is being called");

        return method.invoke(object, args);
    }
}
