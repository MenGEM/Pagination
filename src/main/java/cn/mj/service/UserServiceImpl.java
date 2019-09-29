package cn.mj.service;

import cn.mj.mapper.UserMapper;
import cn.mj.pojo.PageRequest;
import cn.mj.pojo.PageResult;
import cn.mj.pojo.User;
import cn.mj.util.MybatisPageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public int save(User record) {
        return 0;
    }

    @Override
    public int delete(User record) {
        return 0;
    }

    @Override
    public int findById(Long id) {
        return 0;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,userMapper);
    }

    @Override
    public List<User> selectAll() {
        return null;
    }
}
