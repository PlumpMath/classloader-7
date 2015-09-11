import org.junit.Test;

public class ClassloaderTest {
    ReflectiveClass reflect;
    @Test
    public void testClassLoader(){
        while(true) {
            Class clazz = ReflectiveClass.loadClass("/home/artem/", "TestModule");
            System.out.println(ReflectiveClass.createInstance(clazz));
            Thread thread = Thread.currentThread();
            try{
                thread.sleep(3000);
            } catch (InterruptedException e){}
        }
    }
}
