package cn.com.dhc.nssol.db.mapper.tableMapper;

import cn.com.dhc.nssol.db.model.TRole;

public interface TRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    int insert(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    int insertSelective(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    TRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    int updateByPrimaryKeySelective(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMNGSYS01.T_ROLE
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    int updateByPrimaryKey(TRole record);
}