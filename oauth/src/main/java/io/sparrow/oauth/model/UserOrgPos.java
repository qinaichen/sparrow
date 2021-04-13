package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户组织岗位关系信息
 */


@Data
@Entity
@Table(name = "sys_user_org_pos")
@org.hibernate.annotations.Table(appliesTo = "sys_user_org_pos",comment="用户组织岗位关系")
@GenericGenerator(name = "sys_user_org_pos_uuid", strategy = "uuid")
public class UserOrgPos {

    @Id
    @GeneratedValue(generator = "sys_user_org_pos_uuid")
    @Column(length = 32,name = "sys_user_org_pos_id",columnDefinition = "varchar(32) default '' comment '用户组织岗位用户关系ID'")
    private  String id;

    @Column(length = 32,name = "user_id",columnDefinition = "varchar(32) default '' comment '用户ID'")
    private String userId;

    @Column(length = 32,name = "org_id",columnDefinition = "varchar(32) default '' comment '组织ID'")
    private String orgId;
    @Column(length = 32,name = "pos_id",columnDefinition = "varchar(32) default '' comment '岗位ID'")
    private  String posId;
}
