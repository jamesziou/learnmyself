package cn.com.dhc.nssol.db.model;

public class TUserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROMNGSYS01.T_USER_ROLE.USER_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROMNGSYS01.T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROMNGSYS01.T_USER_ROLE.USER_ID
     *
     * @return the value of PROMNGSYS01.T_USER_ROLE.USER_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROMNGSYS01.T_USER_ROLE.USER_ID
     *
     * @param userId the value for PROMNGSYS01.T_USER_ROLE.USER_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROMNGSYS01.T_USER_ROLE.ROLE_ID
     *
     * @return the value of PROMNGSYS01.T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROMNGSYS01.T_USER_ROLE.ROLE_ID
     *
     * @param roleId the value for PROMNGSYS01.T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Sat Jul 29 17:26:19 CST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}