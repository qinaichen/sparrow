package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sys_app")
@org.hibernate.annotations.Table(appliesTo = "sys_app",comment="应用信息")
@GenericGenerator(name = "sys_app_uuid", strategy = "uuid")
public class App {

    /**
     * 应用ID，此标识可用于生成OAuth服务中的client_id
     */
    @Id
    @GeneratedValue(generator = "sys_app_uuid")
    @Column(length = 32,columnDefinition = "varchar(32) comment '系统应用ID'")
    private String id;

    /**
     * 应用名称
     */
    @Column(name = "name",columnDefinition = "varchar(255) comment '系统应用名称'")
    private String name;

    /**
     * 应用类型
     */
    @Column(name = "type",columnDefinition = "int default 0 comment '应用类型,1 内网应用,2 外网应用,0 内外网应用'")
    private Integer type;
    /**
     * 创建时间
     */
    @Column(name = "create_time",columnDefinition = "datetime default CURRENT_TIMESTAMP comment '创建时间'")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time",columnDefinition = "timestamp default CURRENT_TIMESTAMP comment '更新时间'")
    private Date updateTime;
}