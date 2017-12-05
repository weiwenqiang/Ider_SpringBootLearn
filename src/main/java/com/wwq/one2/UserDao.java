package com.wwq.one2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwq on 2017/12/1.
 */
public class UserDao {
    public List<User> queryUserList(){
        List<User> result = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            User user = new User();
            user.setUsername("UserName "+ i);
            user.setPassword("PassWrod "+i);
            user.setAge(i+1);
            result.add(user);
        }
        return result;
    }
}
