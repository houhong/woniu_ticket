package com.houhong.service;

import com.houhong.entry.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName: Test01
 * @Package: com.houhong.service
 * @ClassName: UserServiceTest
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 21:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 21:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 */
public class UserServiceTest {

    @Test
    public void findAllUser() throws SQLException {
        //获取配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得业务层对宪法
        UserService  userService =context.getBean("userService",UserService.class);
        //执行方法
        List<User> allUser = userService.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        /*  userService.deleteUser(1);*/
     /*   userService.saveUser(new User(5,"houho",12));*/

    }

    @Test
    public void findUserById() {
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}