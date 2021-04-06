package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 系统用户信息
 */
@Data
@Entity
@Table(name = "sys_user")
@org.hibernate.annotations.Table(appliesTo = "sys_user",comment="用户信息")
@GenericGenerator(name = "sys_user_uuid", strategy = "uuid")
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(generator = "sys_user_uuid")
    @Column(length = 32,name = "user_id",columnDefinition = "varchar(32) not null default '' comment '用户ID'")
    private String id;

    /**
     * 用户名
     */
    @Column(name = "username",columnDefinition = "varchar(200) not null default '' comment '用户名'")
    private String username;
    /**
     * 用户登录密码
     */
    @Column(name = "password",columnDefinition = "varchar(200) not null default '' comment '用户登录密码'")
    private String password;
    /**
     * 用户昵称
     */
    @Column(name = "nickname",columnDefinition = "varchar(200) not null default '' comment '用户昵称'")
    private String nickname;
    /**
     * 用户头像
     */
    @Column(name = "avatar",columnDefinition = "varchar(255) default null comment '用户头像'")
    private String avatar;
    /**
     * 账号类型
     * 0 临时账号
     * 1 正式账号
     */
    @Column(name = "type",columnDefinition = "int(1) default 0 comment '账号类型,0 临时账号,1 正式账号'")
    private Integer type;

    /**
     * 临时账号的游戏截止时间
     */
    @Column(name = "expire_date", columnDefinition = "datetime comment '临时账号的有效截止时间'")
    private Date expireDate;

    /**
     * 账号创建时间
     */
    @Column(name = "create_date", columnDefinition = "datetime comment '账号的创建时间'")
    private Date createTime;
    /**
     * 密码的最后修改时间
     */
    @Column(name = "last_pass_date", columnDefinition = "datetime comment '密码的最后修改时间'")
    private Date lastPassDate;
    /**
     * 登录错误次数
     */
    @Column(name = "error_times", columnDefinition = "int(1) default 0 comment '密码的最后修改时间'")
    private int errorTimes;
    /**
     * 账号是否锁定
     */
    @Column(name = "locked", columnDefinition = "int(1) default 0 comment '账号是否锁定, 0 未锁定，1 锁定'")
    private int locked;

    @Column(name = "enable" ,columnDefinition = "int(1) default 1 comment '账号是否可用，0 可用,1 禁用'")
    private int enable;




}
