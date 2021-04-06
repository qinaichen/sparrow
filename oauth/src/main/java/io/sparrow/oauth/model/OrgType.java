package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 组织机构类型，用于设定系统中存在哪些组织类型
 */
@Data
@Entity
@Table(name = "sys_org_type")
@org.hibernate.annotations.Table(appliesTo = "sys_org_type",comment="组织机构类型")
@GenericGenerator(name = "sys_org_type_uuid", strategy = "uuid")
public class OrgType {

    @Id
    @GeneratedValue(generator = "sys_org_type_uuid")
    @Column(length = 32,name = "org_type_id",columnDefinition = "varchar(32) not null default '' comment '组织机构类型ID'")
    private String id;
    /**
     * 组织类型名称
     */
    @Column(name = "name",unique = true,columnDefinition = "varchar(200) not null default '' comment '组织类型名称'")
    private String name;

}
