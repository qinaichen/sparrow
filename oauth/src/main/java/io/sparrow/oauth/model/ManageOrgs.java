package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "manage_orgs")
@Data
@org.hibernate.annotations.Table(appliesTo = "manage_orgs",comment="组织规则")
@GenericGenerator(name = "manage_orgs_uuid", strategy = "uuid")
public class ManageOrgs {

    @Id
    @GeneratedValue(generator = "manage_orgs_uuid")
    @Column(length = 32,name = "manage_orgs_id",columnDefinition = "varchar(32) default '' comment '组织规则ID'")
    private String id;

    @Column(length = 32,name = "org_id",columnDefinition = "varchar(32) default '' comment '组织ID'")
    private String orgId;

    @Column(length = 32,name = "part_id",columnDefinition = "varchar(32) default '' comment '被管理的组织ID'")
    private String partId;
}
