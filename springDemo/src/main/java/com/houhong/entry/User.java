package com.houhong.entry;

import java.io.Serializable;

/**
 * @ProjectName: springDemo
 * @Package: com.houhong.entry
 * @ClassName: User
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 19:53
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 19:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 * @Description TODO
 */

public class User implements Serializable {

    private  Integer id;
    private  String name;
    private  Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
