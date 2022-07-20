package others.testSynchronized;

import java.util.concurrent.Callable;

/**
 * @author : Jason.ma
 * @date : 2022/7/20 11:01
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "callable done!";
    }

}
