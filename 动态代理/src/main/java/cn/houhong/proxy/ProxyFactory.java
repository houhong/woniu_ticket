package cn.houhong.proxy;

import cn.houhong.dao.UserDao;
import cn.houhong.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: 动态代理
 * @Package: cn.houhong.proxy
 * @ClassName: ProxyFactory
 * @Description: 我是动态代理工厂
 * @Author: layker
 * @CreateDate: 2019/8/6 0:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 0:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class ProxyFactory {

    //维护一个目标对象
    Object target;


    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyFactory() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
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
class  Test{



    public static void main(String[] args){
        //持有目标对象的引用
        UserDao target = new UserDaoImpl();
        System.out.println(target.getClass());
        //生成代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);
        //为什么可以强转成这个？
        UserDao o =(UserDao) proxyFactory.getProxyFactory();
        //执行方法
        o.save();



    }
}
