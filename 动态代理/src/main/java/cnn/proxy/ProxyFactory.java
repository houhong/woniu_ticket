package cnn.proxy;

import cn.houhong.dao.UserDao;
import cn.houhong.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: 动态代理
 * @Package: cnn.proxy
 * @ClassName: ProxyFactory
 * @Description: 动态代理工厂 用于生成动态代理对象
 * @Author: layker
 * @CreateDate: 2019/8/6 0:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 0:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class ProxyFactory {

    //维护一个objrct
    Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //动态生成proxy
    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //前置增强
                System.out.println("是由代理对象的开始事务2");
                //运用反射执行目标方法：
                Object invoke = method.invoke(target, args);
                //
                System.out.println("提交事务2事务2");
                return invoke;
            }

        });
    }
}

class Test {

    public static void main(String[] args) {
        //创建目标对象
        UserDao target = new UserDaoImpl();
        //创建动态代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        //执行方法
        proxy.save();


    }


}
