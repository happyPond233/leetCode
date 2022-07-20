package others.testSynchronized;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : Jason.ma
 * @date : 2022/7/20 10:42
 */
public class TestMyClass {
    public static void main(String[] args) {
        //静态方法上加synchronized关键字时 所有实现类都去竞争同一个锁；
//        MyClass testClass1 = new MyClass();
//        MyClass testClass2 = new MyClass();
//        MyClass testClass3 = new MyClass();
//        Thread thread1 = new Thread(testClass1);
//        Thread thread2 = new Thread(testClass2);
//        Thread thread3 = new Thread(testClass3);
//        thread1.start();
//        thread2.start();
//        thread3.start();

        //普通方法上加synchronized关键字时 相同的实现类竞争同一把锁;
//        MyClass testClass1 = new MyClass();
//        MyClass testClass2 = new MyClass();
//        MyClass testClass3 = new MyClass();
//        Thread thread1 = new Thread(testClass1);
//        Thread thread2 = new Thread(testClass1);
//        Thread thread3 = new Thread(testClass3);
//        thread1.start();
//        thread2.start();
//        thread3.start();

        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        new Thread(futureTask).start();
        String s = null;
        try {
            Thread.sleep(3000);
            System.out.println("获取结果");
            s = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
