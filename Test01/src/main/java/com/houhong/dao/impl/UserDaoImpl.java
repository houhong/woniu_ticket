package com.houhong.dao.impl;

import com.houhong.dao.UserDao;
import com.houhong.entry.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.annotation.Repeatable;
import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.dao.impl
 * @ClassName: UserDaoImpl
 * @Description: 持久层实现类
 * @Author: layker
 * @CreateDate: 2019/8/5 19:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 19:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class UserDaoImpl implements UserDao {


    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public List<User> findAllUser() throws SQLException {
        return queryRunner.query("select * from user",new BeanListHandler<User>(User.class));
    }

    @Override
    public User findUserById(Integer userId) throws SQLException {
        return (User) queryRunner.query("select * from user where id =? ",new BeanListHandler<User>(User.class),userId);
    }

    @Override
    public void saveUser(User user) throws SQLException {
            queryRunner.update("insert into user(name,age) values(?,?)",user.getName(),user.getAge());
    }

    @Override
    public void updateUser(User user) {
        try {
            queryRunner.update("update user set name=?,age=? where id =?",user.getName(),user.getAge(),user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(Integer userId) {
        try {
            queryRunner.update("delete from user where id=?",userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
