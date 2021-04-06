package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sys_org_rule")
@org.hibernate.annotations.Table(appliesTo = "sys_org_rule",comment="组织规则")
@GenericGenerator(name = "sys_org_rule_uuid", strategy = "uuid")
public class OrgRule {


    @Id
    @GeneratedValue(generator = "sys_org_rule_uuid")
    @Column(length = 32,name = "sys_org_rule_id",columnDefinition = "varchar(32) default '' comment '组织规则ID'")
    private String id;

    @Column(length = 32,name = "org_id",columnDefinition = "varchar(32) default '' comment '组织ID'")
    private String orgId;

    @Column(name = "manage_type",columnDefinition = "int default 0 comment '管理类型,0 管理其自组织,1 管理所有组织,2 管理自定义的组织，从manage_orgs表中获取'")
    private int manageType;
}
