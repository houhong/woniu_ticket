package com.houhong.test;

import com.houhong.entry.User;
import com.houhong.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.test
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 20:43
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 20:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class Test {
    
    public static void main(String[] args) throws SQLException {
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
      /*  userService.saveUser(new User(5,"houho",12));*/
    }
}
