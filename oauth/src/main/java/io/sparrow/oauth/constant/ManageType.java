package io.sparrow.oauth.constant;

/**
 * 组织管理类型
 */
public class ManageType {
    /**
     * 默认管理类型，表示直线型管理，某个组织能管理它下面的所有子组织
     */
    public static int DEFAULT_TYPE = 0;

    /**
     * 可以管理所有的组织机构中的信息
     */
    public static int ALL_TYPE = 1;
    /**
     * 自定义管理类型，如果是该管理类型，则需要到manage_orgs表中或获取其所有可以管理组织ID
     */
    public static int DEFINE_TYPE = 2;
}
