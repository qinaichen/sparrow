package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 组织机构类型规则，定义组织之间的关系
 */
@Data
@Entity

@Table(name = "sys_org_rype_rule")
@org.hibernate.annotations.Table(appliesTo = "sys_org_rype_rule",comment="组织机构类型规则")
@GenericGenerator(name = "sys_org_rype_rule_uuid", strategy = "uuid")
public class OrgTypeRule {

    @Id
    @GeneratedValue(generator = "sys_org_rype_rule_uuid")
    @Column(length = 32,name = "org_type_rule_id",columnDefinition = "varchar(32) default '' comment '组织机构类型规则ID'")
    private String id;

    @Column(name = "parent_id",columnDefinition = "varchar(32) default '' comment '上级组织类型ID'")
    private String parentId;


    @Column(name = "child_id",columnDefinition = "varchar(32) default '' comment '下级组织类型Id'")
    private String childId;


    @Column(name = "num",columnDefinition = "int default -1 comment '组织关系数量,-1 不限制数量'")
    private int num;
}
