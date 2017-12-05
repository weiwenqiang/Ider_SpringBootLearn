package com.wwq.one2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwq on 2017/12/1.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserList(){
        return this.userDao.queryUserList();
    }
}
