package Others.interceptor;

import java.lang.reflect.Proxy;

public class RunMainInterceptorTest {

    public static void main(String[] args) {

    Example example = new Example();

    Interceptor interceptor = new Interceptor(example);

    IExampleInterceptor exampleProxy = (IExampleInterceptor) Proxy.newProxyInstance(
            IExampleInterceptor.class.getClassLoader(),
            new Class[]{IExampleInterceptor.class}, interceptor

    );

    exampleProxy.doAnyThings();

    }
}
