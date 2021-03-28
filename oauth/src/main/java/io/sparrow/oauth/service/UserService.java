package io.sparrow.oauth.service;

import com.google.common.collect.Sets;
import io.sparrow.oauth.dao.UserDao;
import io.sparrow.oauth.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {


    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = this.userDao.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        user.setAuthorities(Sets.newHashSet(new SimpleGrantedAuthority("ROLE_ADMIN")));
        user.setAccountNonExpired(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonLocked(true);
        return user;
    }

    public Page<SysUser> page(int page,int limit){
        return this.userDao.findAll(PageRequest.of(page - 1, limit));
    }

}
