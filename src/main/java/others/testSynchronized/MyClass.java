package others.testSynchronized;

/**
 * @author : Jason.ma
 * @date : 2022/7/20 10:14
 */
public class MyClass implements Runnable{
    public synchronized static String myMethodForSync1(){
        try {
            System.out.println("------ static start:"+ Thread.currentThread().getId() +" ------");
            Thread.sleep(3000);
            System.out.println("------ static end:"+ Thread.currentThread().getId() +" ------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "staticDone";
    }

    public synchronized String myMethodForSync2(){
        try {
            System.out.println("------ normal start:"+ Thread.currentThread().getId() +" ------");
            Thread.sleep(3000);
            System.out.println("------ normal end:"+ Thread.currentThread().getId() +" ------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "normalDone";
    }

    @Override
    public void run() {
        System.out.println("----- 线程开启" + Thread.currentThread().getId() + " -----");
        myMethodForSync2();
        System.out.println("----- 线程关闭" + Thread.currentThread().getId() + " -----");
    }
}
