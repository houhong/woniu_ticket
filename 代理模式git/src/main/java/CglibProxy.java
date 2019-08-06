import com.sun.org.apache.bcel.internal.generic.NEW;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: 代理模式git
 * @Package: PACKAGE_NAME
 * @ClassName: CglibProxy
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/6 8:39
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 8:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */


//目标类
class  CgUserDao{
    public  void save(){
        
        System.out.println("我是目标对象");
    }
    
    
}   

public class CglibProxy implements MethodInterceptor {
    //维护一个目标类
    Object target;

    //生成代理类

    public CglibProxy(Object target) {
        this.target = target;
    }

    public  Object getCgPorxyInstance(){
        //工具类
        Enhancer en = new Enhancer();
        //生成父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类
        return  en.create();


    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //父类的子类
        System.out.println("开始事务");
        //利用反射得到执行方法
        Object invoke= method.invoke(target, objects);
        System.out.println("执行事务");
        return invoke;
    }
}
class  Test{

    public static void main(String[] args){
        //生成子类
        CgUserDao cgUserDao = new CgUserDao();
        //s生成代理对象
        CglibProxy cg = new CglibProxy(cgUserDao);
        //执行
        CgUserDao cgPorxyInstance = (CgUserDao)cg.getCgPorxyInstance();
        cgPorxyInstance.save();
    }
}
