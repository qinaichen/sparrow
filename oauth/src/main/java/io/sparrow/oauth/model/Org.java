package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 组织对象
 * 根据组织类型来存储实际中存在的组织
 */
@Data
@Entity
@Table(name = "sys_org")
@org.hibernate.annotations.Table(appliesTo = "sys_org",comment="组织")
@GenericGenerator(name = "sys_org_uuid", strategy = "uuid")
public class Org {

    /**
     * 组织机构ID
     */
    @Id
    @GeneratedValue(generator = "sys_org_uuid")
    @Column(length = 32,name = "sys_org_id",columnDefinition = "varchar(32) default '' comment '组织ID'")
    private String id;

    /**
     * 组织名称
     */
    @Column(name = "name",columnDefinition = "varchar(200) not null default '' comment '组织名称'")
    private String name;
    /**
     * 组织类型ID
     */
    @Column(name = "type_id",columnDefinition = "varchar(32) not null default '' comment '组织所属类型ID'")
    private String typeId;
    /**
     * 上级组织ID
     */
    @Column(name = "parent_id",columnDefinition = "varchar(32) default '' comment '上级组织ID'")
    private String parentId;
    /**
     * 组织路径，主要用于上下级数据查询，以 / 进行分割
     */
    @Column(name = "org_path",columnDefinition = "text  comment '组织路径'")
    private String path;


}
