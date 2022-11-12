package others.testSynchronized;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * @author : Jason.ma
 * @date : 2022/11/7 06:47
 */
public class SleepTool {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int times = 0;
        Robot robot = new Robot();
        while (true){
            Thread.sleep(5000);
            Point location = MouseInfo.getPointerInfo().getLocation();
            System.out.println("当前times:" + times + ",当前坐标:" + location.x + "," + location.y);
            if (times++ % 2 == 0){
                robot.mouseMove(location.x , location.y + 200);
                robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            } else {
                robot.mouseMove(location.x , location.y - 200);
                robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            }
        }
    }
}
