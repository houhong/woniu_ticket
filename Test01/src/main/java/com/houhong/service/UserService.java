package com.houhong.service;

import com.houhong.entry.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.service
 * @ClassName: UserService
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 19:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 19:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 */
public interface UserService {

    //查询所有
     List<User> findAllUser() throws SQLException;
    //查询一个
    User findUserById(Integer userId) throws SQLException;
    //保存
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);



}
