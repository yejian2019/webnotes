package com.note.back.service;

import com.note.back.domain.User;
import com.note.back.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void add(User bean){
        userMapper.insert(bean);
    }

    public void delete(Integer id){
        userMapper.deleteByPrimaryKey(id);
    }

    public void update(User bean) { userMapper.updateByPrimaryKeySelective(bean); }

    public User get(Integer id) { return userMapper.selectByPrimaryKey(id); }

    public List<User> list(){
        return userMapper.selectAll();
    }

    public boolean isExist(String username) {
        return getUserByUsername(username) != null;
    }

    public User getUserByUsername(String username){
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        List<User> users = userMapper.selectByExample(example);
        return users.get(0);
    }

}
