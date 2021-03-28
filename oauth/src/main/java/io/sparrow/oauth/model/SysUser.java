package io.sparrow.oauth.model;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "sys_user")
@GenericGenerator(name = "sys-user-uuid", strategy = "uuid")
public class SysUser implements UserDetails {

    @Id
    @GeneratedValue(generator = "sys-user-uuid")
    private String id;
    private String username;
    private String nickname;
    private String password;
    /**
     * 账号类型
     * 0.临时账号
     * 1.正式账号
     */
    private int type;
    /**
     * 账号是否未过期
     */
    @Transient
    private boolean accountNonExpired;
    /**
     * 账号是否未锁定
     */
    @Transient
    private boolean accountNonLocked;
    /**
     * 密码是否未过期
     */
    @Transient
    private boolean credentialsNonExpired;
    /**
     * 账号是否可用
     */
    private boolean enabled;

    @Transient
    private Set<GrantedAuthority> authorities;
    /**
     * 最后一次的登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;
    /**
     * 登录失败次数
     */
    @Column(name = "error_times")
    private int errorTimes;
    /**
     * 密码设置时间
     */
    @Column(name = "credential_time")
    private Date credentialTime;
    /**
     * 备注信息
     */
    private String remark;
}
