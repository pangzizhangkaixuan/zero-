package com.zkx.cn.organization.mapping;

import com.zkx.cn.domain.Organization;

public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    int insert(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    int insertSelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    Organization selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Organization record);
}