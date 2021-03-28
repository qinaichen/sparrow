package io.sparrow;

import io.sparrow.oauth.OAuthServer;
import io.sparrow.oauth.dao.UserDao;
import io.sparrow.oauth.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = OAuthServer.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserDao userDao;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void test01(){
        SysUser sysUser = new SysUser();
        sysUser.setUsername("admin");
        sysUser.setPassword(passwordEncoder.encode("123"));
        sysUser.setNickname("系统管理员");
        sysUser.setEnabled(true);
        userDao.save(sysUser);
    }
}
