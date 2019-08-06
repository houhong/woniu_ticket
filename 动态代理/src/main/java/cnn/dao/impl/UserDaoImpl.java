package cnn.dao.impl;

import cn.houhong.dao.UserDao;

/**
 * @ProjectName: 动态代理
 * @Package: cnn.dao.impl
 * @ClassName: UserDaoImpl
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/6 0:34
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/6 0:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("我是目标对象");
    }
}
