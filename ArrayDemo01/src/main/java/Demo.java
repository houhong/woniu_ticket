import java.util.Timer;
import java.util.TimerTask;

/**
 * @ProjectName: ArrayDemo01
 * @Package: PACKAGE_NAME
 * @ClassName: Demo
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/2 11:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/2 11:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class Demo {
    public static void main(String[] args){

          timerT();;
         int[] arr ={1, 2, 3, 2, 3, 10, 4, 4, 2, 2, 1, 2, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){


                    System.out.println(arr[j]);
                }
            }

        }
    }

    public static void timerT(){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("sdfgh");
            }
        }, 100);
    }
}
