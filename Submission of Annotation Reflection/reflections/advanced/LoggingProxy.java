package org.rituraj.reflections.advanced;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
interface Greeting {
    void sayHello();
}
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
public class LoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (proxy, method, methodArgs) -> {
                    System.out.println("Executing: " + method.getName());
                    return method.invoke(new GreetingImpl(), methodArgs);
                });
        greeting.sayHello();
    }
}
