package demo;

import java.lang.reflect.Method;

/**
 * @ProjectName: 代理模式git
 * @Package: demo
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/6 9:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 9:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class Test {
    
    public static void main(String[] args) throws Exception {
        //拿到实列
        Class<?> aClass = Class.forName("demo.Demo");
        Object o = aClass.newInstance();
        //拿到print对象:
        Method print = aClass.getDeclaredMethod("print", String.class);
        print.setAccessible(true);
        for (int i = 0; i < 10; i++) {
            print.invoke(o,Integer.toString(i));
        }
    }
}
