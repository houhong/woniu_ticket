package cn.houhong.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @ProjectName: 动态代理
 * @Package: cn.houhong.proxy
 * @ClassName: CglibFactory
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/6 8:15
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 8:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */


class CgUserDao {

    public void save() {

        System.out.println("我是目标对象");
    }
}


public class CglibFactory implements MethodInterceptor {

    //维护一个对象
    Object target;

    public CglibFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类
        return en.create();


    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务");
        Object invoke = method.invoke(target, objects);
        System.out.println("提交事务");
        return invoke;
    }
}

class Test01 {

    public static void main(String[] args) {
        //目标对象
        CgUserDao target = new CgUserDao();
        //代理对象
        CgUserDao cg = (CgUserDao) new CglibFactory(target).getProxyInstance();
        //执行
        cg.save();
    }
}
