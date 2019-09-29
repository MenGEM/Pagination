package cn.mj.service;

import cn.mj.pojo.User;
import cn.mj.util.CurdSrvice;

import java.util.List;


public interface UserService extends CurdSrvice<User> {
    List<User> selectAll();
}
