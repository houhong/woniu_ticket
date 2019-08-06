package com.houhong.service.impl;

import com.houhong.dao.UserDao;
import com.houhong.entry.User;
import com.houhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.service.impl
 * @ClassName: UserServiceImpl
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 19:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 19:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao dao;



    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao =  dao;
    }


    @Override
    public List<User> findAllUser() throws SQLException {

            return dao.findAllUser();

    }

    @Override
    public User findUserById(Integer userId) throws SQLException {

            return dao.findUserById(userId);

    }

    @Override
    public void saveUser(User user) {
        try {
            dao.saveUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
            dao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
            dao.deleteUser(userId);
    }
}
