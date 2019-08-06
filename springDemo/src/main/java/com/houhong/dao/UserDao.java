package com.houhong.dao;

import com.houhong.entry.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.dao
 * @ClassName: UserDao
 * @Description: 账户持久层
 * @Author: layker
 * @CreateDate: 2019/8/5 19:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 19:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 */

public interface UserDao {


    //查询所有
    List<User> findAllUser() throws SQLException;
    //查询一个
    User findUserById(Integer userId) throws SQLException;
    //保存
    void saveUser(User user) throws SQLException;

    void updateUser(User user);

    void deleteUser(Integer userId);

}
