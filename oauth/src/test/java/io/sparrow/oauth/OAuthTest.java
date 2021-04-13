package io.sparrow.oauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OAuthTest {


    @Autowired
    private JdbcClientDetailsService jdbcClientDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void test01(){
        String appid = UUID.randomUUID().toString();
        String secret = UUID.randomUUID().toString();
        System.out.println(appid);
        System.out.println(secret);
        System.out.println(passwordEncoder.encode(secret));
        /**
         * 56040244-25b3-4ced-861f-167be19362ba
         * ee2a67a3-8c74-4fe6-b154-ad790df7ab9b
         * $2a$10$HqmeVeX4NiXvGi0xnmZg0OgGwi8clUSr5vXwgQHjjAKDU4SaqfPe2
         */

    }
}
