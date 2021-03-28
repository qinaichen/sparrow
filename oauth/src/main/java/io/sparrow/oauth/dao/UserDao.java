package io.sparrow.oauth.dao;

import io.sparrow.oauth.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户信息操作
 */
@Repository
public interface UserDao extends JpaRepository<SysUser,String> {

    SysUser findByUsername(String username);
}
