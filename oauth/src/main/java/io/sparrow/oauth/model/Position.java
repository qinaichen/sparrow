package io.sparrow.oauth.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 岗位信息，用来确定某个用户的所属岗位
 */
@Data
@Entity
@Table(name = "sys_position")
@org.hibernate.annotations.Table(appliesTo = "sys_position",comment="组织")
@GenericGenerator(name = "sys_position_uuid", strategy = "uuid")
public class Position {

    @Id
    @GeneratedValue(generator = "sys_position_uuid")
    @Column(length = 32,name = "sys_pos_id",columnDefinition = "varchar(32) default '' comment '岗位ID'")
    private String id;

    /**
     * 岗位名称
     */
    @Column(name = "name",columnDefinition = "varchar(200) default '' comment '岗位名称'")
    private String name;

}
